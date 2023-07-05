import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(-9, -5, -2, -1, 5, 6, 0, 3, 4);
        List<Integer> integerList2 = List.of(6);
        List<String> words = Arrays.asList("listen", "silent", "hello", "world", "asd");
        List<Person> list3 = List.of(
                new Person("John", 29),
                new Person("Jane", 15),
                new Person("Jake", 20),
                new Person("Joe", 35)
        );
        // 1.
        maxEnumNumber(integerList);

        // 2.
        addPrefAndSuf(words);

        // 3.
        mergeString(words);

        // 4.
        filterAge(list3);

        // 5.
        sumEnumBasicNum(integerList);

        // 6.
        secondMin(integerList);

        //7.
        twoGroupLength(words);

        // 8.
        deleteThreeSimbl(words);
    }

    // 1. Дан список чисел. Необходимо найти максимальное четное число.
    public static void maxEnumNumber(List<Integer> list) {
        int max = list.stream()
                .filter(el -> el % 2 == 0)
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        System.out.println(max);
    }

    // 2. Дан список строк. Необходимо объединить все строки в одну строку, добавив префикс ">>" и суффикс "<<" к каждой строке.
    public static void addPrefAndSuf(List<String> list) {
        String s = list.stream()
                .map(el -> ">>" + el + "<<")
                .collect(Collectors.joining());
        System.out.println(s);
    }

    // 3. Дан список строк. Необходимо объединить все символы из всех строк, удалить дубликаты и отсортировать
    // их в лексикографическом порядке.
    public static void mergeString(List<String> list) {
        String collect = list.stream()
                .collect(Collectors.joining());
        collect = Arrays.stream(collect.split("")).distinct().sorted().collect(Collectors.joining());
        System.out.println(collect);
    }

    // 4. Дан список объектов Person с полем "возраст". Необходимо отфильтровать объекты, возраст которых находится
    // в диапазоне от 25 до 40 лет, отсортировать по имени и вывести результат.
    public static void filterAge(List<Person> list) {
        List<Person> list1 = list.stream()
                .filter(el -> el.getAge() > 25 && el.getAge() < 40)
                .sorted((el1, el2) -> el1.getName().compareTo(el2.getName()))
                .toList();
        System.out.println(list1);
    }

    // 5. Дан список чисел. Необходимо найти сумму всех четных чисел, которые являются положительными.
    public static void sumEnumBasicNum(List<Integer> list) {
        int sum = list.stream()
                .filter(el -> el % 2 == 0 && el > 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }

    // 6.Дан список чисел. Необходимо найти второе минимальное число среди уникальных чисел.
    public static void secondMin(List<Integer> list) {
        int list1 = list.stream()
                .sorted()
                .skip(1)
                .mapToInt(Integer::intValue)
                .min()
                .orElse(Integer.MIN_VALUE);
        System.out.println(list1);
    }

    // 7. Дан список слов. Необходимо разделить их на две группы: одна группа - слова с длиной менее или
    // равной 4 символам, другая группа - слова с длиной более 4 символов. После этого подсчитать количество
    // слов в каждой группе и вывести результат.
    public static void twoGroupLength(List<String> list) {
        Map<Boolean, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(el -> el.length() <= 4));
        System.out.println(collect);
    }

    // 8. Дан список строк. Необходимо пропустить первые три символа в каждой строке и объединить оставшиеся символы в одну строку.
    public static void deleteThreeSimbl(List<String> list) {
        List<String> list1 = list.stream()

                // list -> "mama", "papa", "vlad"

                // el -> "mama" -> ["m", "a", "m", "a"] -> "a"

                // map() || el -> ["1"...] -> "456"

                .map(el -> Arrays.stream(el.split("")).skip(3).collect(Collectors.joining()))

                // el.len == 0

                .toList();


        // todo ...
        System.out.println(list1);


    }

}

@Getter
@AllArgsConstructor
@ToString
class Person {
    private String name;
    private int age;
}
