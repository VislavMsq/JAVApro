import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Random;

// используем библиотеку lombok
@Getter                 // используем геттеры
@Setter
@AllArgsConstructor     // конструктор со всеми аргументами
@ToString

// Comparable - интерфейс для сравнения, сравниваем класс Person
public class Person implements Comparable<Person>, Serializable {
    private String name;
    private int age;
    private int salary;

    // p1.     compareTo  (   p2);
    @Override
    public int compareTo(Person o) {
        // return this.salary - o.salary;
         return this.name.compareTo(o.name);  // сортировка по имени со String
        // сравниваем зп
    }
}

class SalaryComparable implements Comparator<Person>{

    @Override
    // compare(p1,p2)
    public int compare(Person o1, Person o2) {
        return o1.getSalary() - o2.getSalary();
    }
}