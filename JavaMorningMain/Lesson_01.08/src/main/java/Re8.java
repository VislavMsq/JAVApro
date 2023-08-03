import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Re8 {
    static void getEmpInfo(Employee e) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n"
                , e.id, e.name, e.surname, e.salary * (1 + e.bonusPCT));
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", "Johnson", 2500, 0.12);
        getEmpInfo(e1);
    }
}
@AllArgsConstructor
class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPCT;
}
