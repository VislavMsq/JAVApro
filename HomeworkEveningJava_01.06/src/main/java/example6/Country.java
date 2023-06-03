package example6;

import example4.Products;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Counrty implements Comparable<Counrty> {
    private String name;
    private int population;


    @Override
    public int compareTo(Counrty o) {
        if (this.population < o.population) {
            return -1;
        } else if (this.population > o.population) {
            return +1;
        } else {
            return 0;
        }
    }
}

