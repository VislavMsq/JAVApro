package task;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 5, 6, 2, 9);
        List<String> list2 = List.of("qwe", "ert", "asdw", "fgh");

        // 1.
        getPosNum(list);

        // 2.
        getUpper(list2);

        // 3.
        List<Person> list3 = List.of(
                new Person("John", 15),
                new Person("Jane", 15),
                new Person("Jake", 20),
                new Person("Joe", 20)
        );
        getPerson(list3);

        // 4.
        getSum(list);

        // 5.
        getAvg(list);

        // 6.
        getLenWord(list2);

        // 7.
        getDubElem(list);

        // 8.
        getPref(list2, "q");

        // 9.
        getJoinString(list2);

        // 10.
        multByTarget(list, 2);

        // 11.
        stringsLengthSum(list2);

        // 12.
        groupByAge(list3);

        // 13.
        posNum(list);

        // 14.
        firstEnumNum(list);

        // 15.
        convertArray(list);


    }

    // 1. Дан список чисел. Необходимо отфильтровать только положительные числа и вывести их в отсортированном порядке.
    public static void getPosNum(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .filter(el -> el > 0)
                .sorted()
                .toList();
        System.out.println(list1);
    }

    // 2. Дан список строк. Необходимо преобразовать каждую строку в верхний регистр, удалить повторяющиеся строки и вывести результат.
    public static void getUpper(List<String> list) {
        List<String> list1 = list.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(list1);
    }

    // 3. Дан список объектов Person. Необходимо отфильтровать только совершеннолетних людей, отсортировать по имени и вывести результат.
    public static void getPerson(List<Person> list) {
        List<Person> list1 = list.stream()
                .filter(el -> el.getAge() > 18)
                .sorted(Comparator.comparing(Person::getName))
                .toList();
        System.out.println(list1);
    }

    // 4. Дан список чисел. Необходимо найти сумму всех четных чисел.
    public static void getSum(List<Integer> list) {
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }

    // 5. Дан список чисел. Необходимо найти среднее значение всех чисел. //average()
    private static void getAvg(List<Integer> list) {
        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average);

    }

    // 6. Дан список слов. Необходимо найти самое длинное слово.
    private static void getLenWord(List<String> list) {
        Optional<String> sorted = list.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1)       // записывает ссылки стрима в переменную
                .findFirst();          // получает значение переменной

        System.out.println(sorted);
    }

    // 7. Дан список чисел. Необходимо пропустить первые два элемента и вывести остальные
    public static void getDubElem(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .skip(2)
                .toList();

        System.out.println(list1);
    }

    // 8. Дан список слов. Необходимо проверить, содержит ли он хотя бы одно слово, начинающееся с буквы "A".
    public static void getPref(List<String> list, String target) {
        List<Boolean> list1 = list.stream()
                .map(el -> el.startsWith(target))
                .toList();
        System.out.println(list1);
    }

    // 9. Дан список строк. Необходимо объединить их в одну строку, разделенную запятой. //Collectors.joining()
    public static void getJoinString(List<String> list) {
        String joinedFromList = list.stream()
                .collect(Collectors.joining(","));
        System.out.println(joinedFromList);

    }

    // 10. Дан список чисел. Необходимо умножить все числа на заданное значение.
    public static void multByTarget(List<Integer> list, int target) {
        List<Integer> result = list.stream()
                .map(x -> x * target)
                .toList();
        System.out.println(result);
    }

    // 11. Дан список строк. Необходимо найти сумму длин всех строк.
    public static void stringsLengthSum(List<String> list) {
        int sum = list.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(sum);
    }

    // 12. Дан список объектов Person. Необходимо сгруппировать их по возрасту и вывести результат.
    public static void groupByAge(List<Person> list) {
        // ключ getAge , значение элем из List<Person>
        Map<Integer, List<Person>> list1 = list.stream()
                // Collectors - спец класс где есть методы для сборки всего. groupingBy - сгруперовал и вернул Map
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(list1);
    }

    // 13. Дан список чисел. Необходимо проверить, являются ли все числа положительными.
    public static void posNum(List<Integer> list) {
        boolean positive = list.stream()
                .allMatch(integer -> integer > 0);

        if (positive) {
            System.out.println("All positive numbers");
        } else {
            System.out.println("Not all positive numbers");
        }
    }

    // 14. Дан список чисел. Необходимо найти первое четное число.
    public static void firstEnumNum(List<Integer> list) {
        Optional<Integer> first = list.stream()
                .filter(el -> el % 2 == 0)
                .findFirst();
        System.out.println(first);
    }
    // 15. Дан список чисел. Необходимо преобразовать его в массив.
    public static void convertArray(List<Integer>list){
        int[] array = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(array));
    }

}

@Getter
@AllArgsConstructor
@ToString
class Person {
    private String name;
    private int age;
}