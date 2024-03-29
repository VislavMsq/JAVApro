package TaskClass.DiningRoom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@Setter
public class Dish {
    private String name;
    private double price;
    private Category category;
}
