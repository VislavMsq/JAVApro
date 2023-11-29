package aloneInternetShop;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class Order {
    private String orderId;
    private double totalAmount;
    private List<OrderItem> items = new ArrayList<>();

    public Order(String orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
        totalAmount -= item.getItemPrice();
    }

    public void removeItem(String itemName) {
        Iterator<OrderItem> itemIterator = items.iterator();
        while (itemIterator.hasNext()) {
            OrderItem item = itemIterator.next();
            if (item.getItemName().contains(itemName)) {
                this.totalAmount -= item.getItemPrice();
                itemIterator.remove();
                break;
            }
        }
    }

    public double calculateTotalAmount() {
        return totalAmount;
    }
}
