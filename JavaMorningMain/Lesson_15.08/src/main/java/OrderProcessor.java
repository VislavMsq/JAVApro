import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class OrderProcessor {
    private List<Order> orders;

    public void addOrder(Order order) {
        if (order == null || order.getProducts() == null || order.getOrderDate() == null) {
            throw new InvalidOrderException();
        }

        Map<Product, Long> map = order.getProducts().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<Product, Long> entry : map.entrySet()) {
            if (entry.getKey().getQuantity() < entry.getValue()) {
                throw new IllegalArgumentException("not enough quantity");
            }
        }
        orders.add(order);
    }

    public double calculateTotalRevenue() {
        return orders.stream()
                .mapToDouble(Order::calculateTotalPrice)
                .sum();
    }

    public List<Order> getExpiredOrders() {
        return orders.stream()
                .filter(Order::isOrderExpired)
                .collect(Collectors.toList());
    }
}
