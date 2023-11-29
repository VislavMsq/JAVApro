package taski;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );


        // 1.
        uniqueNum(numbers);

        // 2.
        uniqueNum1(numbers);

        // 3.
        groupWords(words);
    }

    // Задача 1: Подсчет количества уникальных четных и нечетных чисел
    public static void uniqueNum(List<Integer> list) {
        long count = list.stream()
                .distinct()
                .filter(el -> el % 2 == 0)
                .count();
        long count1 = list.stream()
                .distinct()
                .filter(el -> el % 2 == 1)
                .count();
        System.out.println("Enum: " + count + "\nOdd: " + count1);
    }

    public static void uniqueNum1(List<Integer> list) {
        Map<Boolean, Long> collect = list.stream()
                .collect(Collectors.partitioningBy(el -> el % 2 == 0, Collectors.counting()));
        System.out.println(collect);
    }

    // Задача 2: Группировка строк по первым буквам и вывод первых двух слов из каждой группы
    public static void groupWords(List<String> list) {
        Map<Character, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(el -> el.charAt(0)));
        System.out.println(collect);
    }

    // Задача 3: Преобразование списков в строку и удаление повторяющихся символов
//    public static void margeList(List<String> list) {
//        list.stream()
//                .flatMap()
//    }
}
