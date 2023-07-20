package product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Создайте класс "Заказ" (Order), который имеет поля: номер заказа (orderNumber), список товаров (products) и статус
 заказа (status). Класс "Товар" (Product) имеет поля: название (name), цена (price) и количество (quantity). Добавьте
 методы для добавления товаров в заказ, изменения статуса заказа и расчета общей стоимости заказа.

 class Order
    int orderNumber
    List<Products>
    enum status

            Methode
                ++ addProduct
                ++ changeStatus
                ++ sumOrder
                ++ generateNumOrder - 9 num

 class Product
    String name
    int price
    int quantity






 */
@Getter
@Setter
@ToString
public class Order {
    private long orderNumber;
    private Status status;
    private List<Product> productList;

    private long generateNumOrder() {
        Random random = new Random();
        return random.nextLong(990_000_000, 1_000_000_000);
    }

    public Order() {
        this.orderNumber = generateNumOrder();
        this.status = Status.НА_СКЛАДЕ;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public int sumOrder() {
        return this.productList.stream()
                .map(el -> el.getPrice() * el.getQuantity())
                .mapToInt(Integer::intValue)
                .sum();

    }

    public void changeStatus() {

        // switch -> val = this.status
        //


        switch (this.status) {
            case НА_СКЛАДЕ -> this.status = Status.ОЖИДАЕТ_ОТПРАВКИ;
            case ОЖИДАЕТ_ОТПРАВКИ -> this.status = Status.В_ДОРОГЕ;
            case В_ДОРОГЕ -> this.status = Status.В_ОЖИДАНИИ_ПОЛУЧАТЕЛЯ;
            case В_ОЖИДАНИИ_ПОЛУЧАТЕЛЯ -> System.out.println("Ваша посылка в отделении почты, можете забрать ее!");
        }
    }

}
