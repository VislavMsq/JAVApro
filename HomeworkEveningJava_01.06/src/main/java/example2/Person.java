package example2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    @Override
    public int compareTo(Person elem) {
        if(this.age < elem.age){
            return -1;
        }else if(this.age > elem.age){
            return +1;
        }else {
            return 0;
        }
    }
}
