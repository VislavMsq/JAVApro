package taski;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("apple", "banana", "cherry", "Apple", "Banana", "Cherry");

        // 1.
        filterNum(numbers);

        // 2.
        wordWorks(words);

        // 3.
        squareEnumNum(numbers);

        // 4.
        sumEnumNum(numbers);

        // 5.
        conventString(numbers);

        // 6.
        getFirstEvenNum(numbers);

        // 7.
        checkString(words);

        // 8.
        skipElem(numbers);

        // 9.
        minAndMax(numbers);

        // 10.
        grouping(words);

        // 11.
        getAVG(numbers);

        // 12.
        findWord(words);

        // 12.1
        findWordMap(words);

        // 13.
        squareSort(numbers);

        // 14.
        binarySwap(numbers);

        // 15.
        filter(numbers);

    }

    // Задача 1: Фильтрация чисел больше 5 и вывод в порядке убывания
    public static void filterNum(List<Integer> num) {
        List<Integer> list = num.stream()
                .filter(el -> el > 5)
                .sorted((el1, el2) -> el2 - el1)
                .toList();
        System.out.println(list);
    }

    // Задача 2: Преобразование строк в верхний регистр и удаление дубликатов
    public static void wordWorks(List<String> list) {
        List<String> distinct = list.stream()
                .map(String::toUpperCase)
                .distinct()
                .toList();
        System.out.println(distinct);
    }

    // Задача 3: Вывод квадратов чисел, удовлетворяющих условию четности числа
    public static void squareEnumNum(List<Integer> list) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> quadratAndEven = nums.stream()
                .filter(el -> el % 2 == 0)
                .map(num -> num * num)
                .toList();
        System.out.println(quadratAndEven);
    }

    // Задача 4: Подсчет суммы четных чисел
    public static void sumEnumNum(List<Integer> list) {
        int sum = list.stream()
                .filter(el -> el % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }

    // Задача 5: Преобразование чисел в строки и объединение их с разделителем
    public static void conventString(List<Integer> list) {
        String collect = list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }

    //     Задача 6: Поиск первого четного числа
    public static void getFirstEvenNum(List<Integer> list) {
        Optional<Integer> first = list.stream()
                .filter(el -> el % 2 == 0)
                .findFirst();
        first.ifPresent(value -> System.out.println("First -> " + value));
        System.out.println(first);
    }

    // Задача 7: Проверка, все ли строки начинаются с буквы "A"
    public static void checkString(List<String> list) {
        boolean a = list.stream()
                .allMatch(el -> el.startsWith("A"));   // allMatch - ?
        System.out.println(a);

    }

    // Задача 8: Пропуск первых 3 чисел и сумма оставшихся
    public static void skipElem(List<Integer> list) {
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .skip(3)
                .sum();
        System.out.println(sum);
    }

    // Задача 9: Выбор минимального и максимального числа из листа
    public static void minAndMax(List<Integer> list) {
        OptionalInt min = list.stream()
                .mapToInt(Integer::intValue)
                .min();
        OptionalInt max = list.stream()
                .mapToInt(Integer::intValue)
                .max();

        System.out.println("Min -> " + min);
        System.out.println("Max -> " + max);
    }


    public static void grouping(List<String> list) {
        // Задача 10: Группировка слов по длине
        Map<Integer, List<String>> group = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(group);
    }

    // Задача 11: Подсчет среднего значения чисел
    public static void getAVG(List<Integer> values) {
        OptionalDouble avg = values.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(avg);
    }

    // Задача 12: Поиск всех слов, содержащих букву "a"
    public static void findWord(List<String> list) {
        List<String> a = list.stream()
                .filter(el -> el.contains("a"))
                .toList();
        System.out.println(a);

        // obj -> map 2 > 6 -> obj

        // obj -> filet 2==n -> bool
    }

    public static void findWordMap(List<String> list) {
        Map<String, List<String>> a = list.stream()
                .collect(Collectors.groupingBy(el -> el.contains("a") ? "Contains" : "notContains"));
        System.out.println(a);
    }

    // Задача 13: Преобразование чисел в квадрат и сортировка в обратном порядке
    public static void squareSort(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .map(el -> el * el)
                .sorted((el1, el2) -> el2 - el1)
                .toList();
        System.out.println(list1);
    }

    // Задача 14: Преобразование чисел в двоичный формат и объединение в строку
    public static void binarySwap(List<Integer> list) {
        String collect = list.stream()
                .map(Integer::toBinaryString)
                .collect(Collectors.joining(" "));
        System.out.println(collect);

//         String bytes = list.stream()
//                        .map(el -> String.format("%8s", Integer.toBinaryString(el)).replace(" ", "0"))
//                        .collect(Collectors.joining(" "));
//                System.out.println(bytes);
    }

    // Задача 15: Фильтрация чисел, кратных 3, и преобразование их в строки
    public static void filter(List<Integer>list) {
        String collect = list.stream()
                .filter(el -> el % 3 == 0)
                .map(el -> Integer.toString(el))
                .collect(Collectors.joining(" "));

        System.out.println(collect);
    }
}


