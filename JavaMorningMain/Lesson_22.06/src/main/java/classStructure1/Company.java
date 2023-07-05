package classStructure1;

import classStructure1.enums.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
/*

- Company
    - ++String name
    - ++Set<Employee>
    - ++Set<Department>

 */
@Getter
@Setter
@ToString
public class Company {
    private String name;
    private Set<Employee> employeeSet;
    private Set<Department> departmentSet;
    private Map<Integer, Position> map;


    public Company(String name, Set<Employee> employeeSet, Set<Department> departmentSet) {
        this.name = name;
        this.employeeSet = employeeSet;
        this.departmentSet = departmentSet;
    }
}
