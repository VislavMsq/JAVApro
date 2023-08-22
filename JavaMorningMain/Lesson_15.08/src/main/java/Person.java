import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class Person implements Comparable<Person> {

    public static final int LEGAL_AGE = 18;

    private String name;
    private int age;
    private String address;


    public String getSummary() {
        return "name: " + name +
                "age: " + age;
    }

    public boolean isAdult() {
        return age >= LEGAL_AGE;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
