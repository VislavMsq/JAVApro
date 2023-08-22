import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor
public class Order {
    public static final int DAYS_BEFORE_EXPIRATION = 7;
    private int orderId;
    private Person customer;
    private List<Product> products;
    private LocalDate orderDate;

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public int getNumberOfProducts() {
        return products.size();
    }

    public boolean isOrderExpired() {
        return orderDate.isBefore(LocalDate.now().minusDays(DAYS_BEFORE_EXPIRATION));
    }
}

