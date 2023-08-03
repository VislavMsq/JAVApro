package onlineShopWithDelivery;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@ToString
@Getter
@Setter
public class Order {
    private final List<Product> basket;
    private final String data;
    private TypeDelivery typeDelivery;
    private double sum;

    // Client -> basket.add()
    // new Order -> Order.basket < Client.getBasket
    // Client.addHistory(new Order)

    public Order(List<Product> basket, TypeDelivery typeDelivery) {
        this.basket = basket;
        this.data = LocalDateTime.now().toString();
        this.typeDelivery = typeDelivery;
        this.sum = allSum();

    }

    public int allSum() {
        return this.basket.stream()
                .mapToInt(Product::sum)
                .sum();
    }
}
