package Product;

import lombok.Setter;

import java.util.List;


public class OrderManager {
    public static Order createOrder(String customerName, List<Product> products) {
        return new Order(1234, customerName, products, Status.NEW);
    }


    public static void updateOrderStatus(Order order, String newStatus) {
        order.changeStatus(newStatus);
    }

    public static int calculateTotalPrice(Order order) {
        int sum = 0;
        for (int i = 0; i < order.getListProd().size(); i++) {
            Product product = order.getListProd().get(i);
            sum += product.getPrice() * product.getAvailableQuantity();
        }
        return sum;
    }
}
