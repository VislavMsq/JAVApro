package shopClass;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@ToString
public class Customer {
    private String name;
    private List<Product> purchasedProducts;

    public Customer(String name) {
        this.name = name;
        this.purchasedProducts = new ArrayList<>();
    }
}
