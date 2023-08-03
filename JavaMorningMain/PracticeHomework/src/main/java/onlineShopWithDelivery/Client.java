package onlineShopWithDelivery;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
public class Client {
    private String name;
    private int addressDelivery;
    private List<Order> history;
    private List<Product> basket;
    private boolean isAdmin;

    public Client(String name, int addressDelivery) {
        this.name = name;
        this.addressDelivery = addressDelivery;
        this.history = new ArrayList<>();
        this.basket = new ArrayList<>();
        this.isAdmin = false;
    }

    public void addToBasket(Product product) {
        this.basket.add(product);
    }
}
