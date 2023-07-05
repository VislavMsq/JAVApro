package classStructure1;

import classStructure1.enums.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
- Employee
    - ++name
    - ++Department(энам)
    - ++Position(энам)
    - ++double salary
 */
@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private Department department;
    private Position position;
    private double salary;

    public Employee(String name, Department department, Position position, double salary) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }
}
