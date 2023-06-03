package example2;

import java.awt.event.PaintEvent;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    /*
    Задача 1 :
    Напишите класс Person, который имеет следующие поля:

    name (тип String) - имя человека;
    age (тип int) - возраст человека.

    Реализуйте интерфейс Comparable для класса Person, чтобы объекты Person могли
    быть сравниваемыми на основе возраста. При сравнении двух объектов Person должно
    возвращаться отрицательное число, если первый объект младше второго, положительное число,
    если первый объект старше второго, и ноль, если объекты равны по возрасту.
     */
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        Person p1 = new Person("John",32);
        Person p2 = new Person("Bill",29);
        Person p3 = new Person("Derek",25);
        Person p4 = new Person("Smith",20);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(p2.compareTo(p1));



    }
}
