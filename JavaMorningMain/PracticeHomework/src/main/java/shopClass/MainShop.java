package shopClass;

public class MainShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct(new Product("Iphone 14proMax", 1600.0, 10));
        shop.addProduct(new Product("Banana", 1.20, 30));
        shop.addProduct(new Product("BMW M5", 120000, 2));

        Customer customer = new Customer("Billy");
        Customer customer2 = new Customer("Megan");

        shop.buyProduct("BMW M5", 2, customer);
        shop.buyProduct("Banana", 29, customer);

        System.out.println(shop.checkBuy(customer));

        shop.getProductList();

    }


    // добавити продукти в магаз

    // создати покупців

    // купити шось

}
