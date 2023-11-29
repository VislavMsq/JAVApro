package lessonTask1;

import lombok.Getter;

import java.util.Random;

@Getter
public class Order extends Thread{
    private int orderId;
    private String orderDetails;

    public Order(int orderId, String orderDetails) {
        this.orderId = generateID();
        this.orderDetails = orderDetails;
    }

    private int generateID() {
        Random random = new Random();
        return random.nextInt(999, 9999);
    }

    public void process() {
        System.out.println("Order start! " + " " + orderId);
        Random random = new Random();
        try {
            int process = random.nextInt(1, 5);
            Thread.sleep((process) + 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Order finish! " + " " + orderId);
    }
}
