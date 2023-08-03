import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class Developer {
    private String firstName;
    private String lastName;
    private int salary;
    private char gender;
    private Car car;

    public Developer(String firstName, String lastName, int salary, char gender, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
        this.car = car;
    }
}
