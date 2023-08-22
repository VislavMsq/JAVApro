import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public double getTotalPrice() {
        return price * quantity;
    }

    public boolean isAvailable() {
        return quantity > 0;
    }

}
