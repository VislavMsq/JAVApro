package Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
public class Product {
    private int id;
    private String name;
    private int price;
    private int availableQuantity;

    public boolean isAvailable() {
        return availableQuantity > 0;
    }

    public void decreaseQuantity(int quantity) {
        if (quantity > availableQuantity) {
            throw new NotEnoughQuantityException();
        } else if (quantity < 1) {
            throw new NotAllowedQuantityException();
        }
        availableQuantity -= quantity;
    }
}
