import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Car {
    private Color color;
    private int maxSpeed;
    private boolean isSport;
    private BrandAuto brandAuto;
}
