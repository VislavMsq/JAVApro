import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Factory implements Comparable<Factory> {
    private int id;
    private String name;
    private Product product;
    private boolean isDebt;

    @Override
    public int compareTo(Factory o) {
        return id - o.id;
    }
}

