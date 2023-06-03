package example5;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    /*
    Напишите класс Student, который имеет следующие поля:


    name (тип String) - имя студента;
    grade (тип int) - оценка студента.
    Реализуйте интерфейс Comparable для класса Student, чтобы объекты Student могли быть сравниваемыми на
    основе оценки. При сравнении двух объектов Student должно возвращаться отрицательное число, если первый
    студент имеет более низкую оценку, положительное число, если первый студент имеет более высокую оценку,
    и ноль, если студенты имеют одинаковую оценку.
     */
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        Student s = new Student("Ivan",3);
        Student s2 = new Student("Maksim",2);
        Student s3 = new Student("Petr",1);
        Student s4 = new Student("David",5);

        studentSet.add(s);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);

        System.out.println(s3.compareTo(s));
    }
}
