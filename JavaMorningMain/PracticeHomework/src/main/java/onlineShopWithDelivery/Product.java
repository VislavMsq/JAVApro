package onlineShopWithDelivery;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@ToString
@Getter
@Setter
public class Product {
    private final String name;
    private final int price;
    private int quantity;
    private final String article;

    private String generateUniqueNum() {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int q = random.nextInt(0, 91);
            if (q < 65) {
                stringBuilder.append(random.nextInt(0, 10));
            } else {
                stringBuilder.append((char) q);
            }
        }
        return stringBuilder.toString();
    }

    // 2 3 4 5 6 7 8 8 -> 12 43 45 23 78
//65-90  | 0, 91 | n->char
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.article = generateUniqueNum();

    }

    public int sum() {
        return this.price * this.quantity;
    }


}
