package product;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addProduct(new Product("Iphone 14pro", 1500,2));
        order.addProduct(new Product("MacBook Pro M2", 2700,1));
        order.addProduct(new Product("Apple AR-VR", 3500,3));

        System.out.println(order.getOrderNumber());
        System.out.println(order.sumOrder());
    }
}
