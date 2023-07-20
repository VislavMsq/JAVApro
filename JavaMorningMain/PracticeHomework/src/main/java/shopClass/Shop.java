package shopClass;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/*
 Создайте класс "Магазин" (Shop), который имеет поля: список товаров (products) и список покупателей (customers).
 Класс "Товар" (Product) имеет поля: название (name), цена (price) и количество на складе (quantity). Класс "Покупатель"
 (Customer) имеет поля: имя (name) и список купленных товаров (purchasedProducts). Добавьте методы для добавления
 товаров в магазин, покупки товара покупателем и обновления количества товара на складе.
 */
/*
class Shop
    products - List
    customers - List
                     methode:
                        addProduct
                        buyProduct
                        updateProduct

class Product
    String name
    double price
    int quantity

class Customer
    String name
    purchasedProducts - List


 */
@Getter
@ToString
public class Shop {
    private List<Product> listProducts;
    private List<Customer> listCustomers;

    public Shop() {
        this.listProducts = new ArrayList<>();
        this.listCustomers = new ArrayList<>();
    }

    public void addProduct(Product product) {
        List<String> pList;

        // p.name
        // listProducts List<prod> -> listNameProducts List<Str>
        // p.name in listNameProducts

        if (product == null) {
            System.out.println("Продукт не инициализирован");
            return;
        } else if ((pList = this.listProducts.stream().map(Product::getName).toList()).contains(product.getName())) {
            int countPro = pList.indexOf(product.getName());

            // [pr1, pr2...]
            // [баннан, огірок...]
            // [баннан, огірок...].indexOf(баннан) -> 0
            // [pr1, pr2...].get(0)

            Product product1 = this.listProducts.get(countPro); // List.get(index)

            int co = product1.getQuantity();

            product1.setQuantity(co + product.getQuantity()); // изменили кл-во товара через set

            System.out.println(product.getName() + " присутвует на складе, в колличестве -> | " + co + " -> " + product.getQuantity());
            return;
        }
        this.listProducts.add(product);
        System.out.println("Add products -> " + product.getName());
    }

    public void buyProduct(String name, int quantity, Customer customer) {
        List<String> shopList;
        if ((shopList = this.listProducts.stream().map(Product::getName).toList()).contains(name)) {
            int countPro = shopList.indexOf(name);
            Product co = this.listProducts.get(countPro);
            if (co.getQuantity() >= quantity) {
                customer.getPurchasedProducts().add(new Product(co.getName(), co.getPrice(), quantity));
                updateProduct(new Product(co.getName(), co.getPrice(), co.getQuantity() - quantity));
                System.out.println("Спасибо за покупку!");
            } else {
                System.out.println("Нет такого кл-ва продукта🤷🏻‍♀️" + " есть только -> " + co.getQuantity());
            }
        } else {
            System.out.println("Такого продукта не найдено!");
        }
    }

    public void updateProduct(Product product) {
        List<String> shopList = this.listProducts.stream().map(Product::getName).toList();
        int countPro = shopList.indexOf(product.getName());
        Product co = this.listProducts.get(countPro);

        co.setQuantity(product.getQuantity());
        System.out.println(product.getName() + " обновлен в магазине!" + " Кл-во на складе -> " + product.getQuantity());
    }

    public double checkBuy(Customer customer) {
        return customer.getPurchasedProducts().stream().mapToDouble(el -> el.getPrice() * el.getQuantity()).sum();
    }
    public void getProductList(){
        this.listProducts.forEach(el -> System.out.println("продукт -> "+ el.getName() + "\n\tколичество: " + el.getQuantity()));
    }
}
