package example6;

import java.util.HashSet;
import java.util.Set;

public class Task5 {
    /*
    Задача 5 (Сложность 3/10):
    Напишите класс Country, который имеет следующие поля:

    name (тип String) - название страны;
    population (тип int) - население страны.
    Реализуйте интерфейс Comparable для класса Country, чтобы объекты Country могли быть сравниваемыми
    на основе населения. При сравнении двух объектов Country должно возвращаться отрицательное число,
    если первая страна имеет меньшее население, положительное число, если первая страна имеет большее население,
    и ноль, если страны имеют одинаковое население.
     */
    public static void main(String[] args) {
        Set<Counrty> studentSet = new HashSet<>();

        Counrty counrty = new Counrty("Ukraine",40_997_699);
        Counrty counrty2 = new Counrty("Spain",46_934_632);
        Counrty counrty3 = new Counrty("Germany",84_270_625);
        Counrty counrty4 = new Counrty("Finland",5_526_774);

        studentSet.add(counrty);
        studentSet.add(counrty2);
        studentSet.add(counrty3);
        studentSet.add(counrty4);

        System.out.println(counrty4.compareTo(counrty2));
    }
}
