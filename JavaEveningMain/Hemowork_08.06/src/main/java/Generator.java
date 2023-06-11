import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static List<Employee> generateEmployee(){
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee("Shirley Gomez","Manager",28,4500.0);
        Employee e2 = new Employee("Doris Harris","Marketer",32,4100.8);
        Employee e3 = new Employee("Javier White","Engineer",35,6000.5);
        Employee e4 = new Employee("James Owens","Programmer",26,5500.3);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        return employees;
    }
}
