package tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import javax.swing.*;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Task {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 7, 9, 2, 6, -4);
        List<String> list2 = List.of("qwe", "asd", "zxc", "rty");
        List<Person> list3 = List.of(
                new Person("John", 15),
                new Person("Jane", 15),
                new Person("Jake", 20),
                new Person("Joe", 20)
        );

        // 1.
        getPosNum(list);

        // 2.
        upperPrint(list2);

        // 3.
        filterPerson(list3);

        // 4.
        getSum(list);

        //5.
    }

    // 1. Дан список чисел. Необходимо отфильтровать только положительные числа и вывести их в отсортированном порядке.
    public static void getPosNum(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .filter(el -> el > 0)
                .sorted()
                .toList();
        System.out.println(list1);
    }

    // 2. Дан список строк. Необходимо преобразовать каждую строку в верхний регистр, удалить
    // повторяющиеся строки и вывести результат.
    public static void upperPrint(List<String> list) {
        List<String> list1 = list.stream()
                .map(String::toUpperCase)
                .distinct()
                .toList();
        System.out.println(list1);
    }

    // 3. Дан список объектов Person. Необходимо отфильтровать только совершеннолетних людей,
    // отсортировать по имени и вывести результат.
    public static void filterPerson(List<Person> list) {
        List<Person> list1 = list.stream()
                .filter(el -> el.getAge() > 18)
                .sorted(Comparator.comparing(Person::getName))
                .toList();
        System.out.println(list1);
    }
    // 4. Дан список чисел. Необходимо найти сумму всех четных чисел.
    public static void getSum(List<Integer> list) {
        int sum = list.stream()
                .filter(el -> el % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
    // 5. Дан список чисел. Необходимо найти среднее значение всех чисел. //average()
    public static void findAvg(List<Integer>list){
        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average);
    }
    // 6. Дан список слов. Необходимо найти самое длинное слово.

}




@Getter
@AllArgsConstructor
@ToString
class Person{
    private String name;
    private int age;
}