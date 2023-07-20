package tasks;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        List<String> words = Arrays.asList("apple", "abanana", "cherry", "date", "elderberry", "fig", "grape", "apanas");
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );

        // 1.
        uniqueNum(numbers);

        // 2.
        uniqueWord(words);

        // 3.
//        transformationString(listOfLists);
    }

    // Задача 1: Подсчет количества уникальных четных и нечетных чисел
    public static void uniqueNum(List<Integer> numbers) {
        Map<Boolean, Long> objectStream = numbers.stream()
                .distinct()
                .collect(Collectors.partitioningBy(el -> el % 2 == 0, Collectors.counting()));
        System.out.println(objectStream);
        // collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.counting()))
    }

    // Задача 2: Группировка строк по первым буквам и вывод первых двух из каждой группы
    public static void uniqueWord(List<String> words) {
        Map<String, List<String>> objectStream = words.stream()
                .limit(2)
                .collect(Collectors.groupingBy(el -> String.valueOf(el.substring(0, 1))));
        System.out.println(objectStream);

        //List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
        //        Map<Character, List<String>> groupedWords = words.stream()
        //                .sorted()
        //                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        //        groupedWords.values().stream()
        //                .map(list -> list.stream().limit(2))
        //                .toList()
        //                .forEach(System.out::println);
    }

    // Задача 3: Преобразование списков в строку и удаление повторяющихся символов

}
