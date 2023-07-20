import java.util.*;
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
        List<Integer> numbers2 = Arrays.asList(1, 3, 2, 6, 4, 5, 7, 8, 9);

        List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5, 67, 8, 9, 10, 11, 12, 13, 14, 15);

        // 1.
        uniqueNum(numbers);

        // 1. (2.0)
        uniqueNum2(numbers);

        // 2.
        groupByFirstSymbol(words);

        // 3.
        margeList(listOfLists);

        // 4.
        filterAndMulti(numbers2);

        // 4.
        basicNumAndComposite(numbers3);
    }

    // Задача 1: Подсчет количества уникальных четных и нечетных чисел
    public static void uniqueNum(List<Integer> list) {
        long list1 = list.stream()
                .distinct()
                .filter(el -> el % 2 == 0)
                .count();
        long list2 = list.stream()
                .distinct()
                .filter(el -> el % 2 == 1)
                .count();

        System.out.println("Enum: " + list1 + " \nOdd: " + list2);
        System.out.println("---------------------------------------");
    }

    // Задача 1 (2.0)
    public static void uniqueNum2(List<Integer> list) {
        Map<Boolean, Long> collect = list.stream()
                .distinct()
                .collect(Collectors.partitioningBy(el -> el % 2 == 0, Collectors.counting()));
        System.out.println(collect);
        System.out.println("---------------------------------------");
    }

    // Задача 2: Группировка строк по первым буквам и вывод первых двух из каждой группы
    public static void groupByFirstSymbol(List<String> list) {
        Map<Character, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(el -> el.charAt(0)));
        //      .collect(Collectors.groupingBy(el -> el.split("")[0]);

        //        str     str[] index
        // el = String.split("")[0] -> str
        //String[] arr = String.split("") -> String[]

        collect.forEach((key, value) -> {
            System.out.println(key + ": ");
            value.stream() // -> List
                    .limit(2)
                    .forEach(System.out::println);
            System.out.println();
        });
    }

    // Задача 3: Преобразование списков в строку и удаление повторяющихся символов
    public static void margeList(List<List<String>> list) {
        String collect = list.stream()
                .flatMap(Collection::stream)   // List<List<String>> -> List<String>
                .distinct()
                .sorted()
                .collect(Collectors.joining());// List<String> -> String

        System.out.println(collect);
        System.out.println("---------------------------------------");
    }

    // Задача 4: Фильтрация и умножение числа на 2
    public static void filterAndMulti(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .filter(el -> el % 2 == 0)
                .map(el -> el * 2)
                .sorted()
                .toList();
        System.out.println(list1);
        System.out.println("---------------------------------------");
    }

    // Задача 5: Разделение чисел на простые и составные
    public static void basicNumAndComposite(List<Integer> list) {
        Map<Boolean, List<Integer>> collect = list.stream()
                .collect(Collectors.partitioningBy(Task::isPrime));
        System.out.println(collect);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // 10 ~ 9 -> 3
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}



