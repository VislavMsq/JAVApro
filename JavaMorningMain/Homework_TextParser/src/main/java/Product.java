import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private String category;
    private int quantity;
    private boolean isPacked;
    private boolean isAdv;
    private float price;
    private float margin;


    public float getTotalPrice() {
        return price * quantity;
    }
}
