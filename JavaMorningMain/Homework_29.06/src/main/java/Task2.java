import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = List.of("qwewww", "as", "zxc", "rty", "aaaa", "bbbb", "bbbb", "cccc");
        List<String> list2 = List.of("qw  e", "qw  e", "z xc", "r ty", "z x c", "b b b", "c c p");
        List<String> words = Arrays.asList("listen", "silent", "hello", "world");

        List<Integer> integerList = List.of(-5, -2, -1, 5, 6, 0, 3, 4);
        List<Integer> basicList1 = List.of(1, 1, 2, 3, 4);
        List<Integer> basicList2 = List.of(2, 4, 5);

        // 1.
        joinString(list2);

        // 2.

        // 3.
        listDifference(basicList1, basicList2);

        // 4.

        // 5.
        filterString(list2, "q", "e");

        // 6.
        countChar(list);

        // 7.
        avgUniqueNum(basicList1);

        // 7.1.
        avgUniqueNum2(basicList1);

        // 8.
        moreEnumLength(words);

        // 9.
        splitDeleteString(list2);

        // 10.
        palindrome(list);

    }

    // 1. Дан список слов. Необходимо объединить все символы из всех слов в одну строку.
    public static void joinString(List<String> list) {
        String collect = list.stream()
                .collect(Collectors.joining(""));
        System.out.println(collect);
    }

    // 2. Дан список слов. Необходимо проверить, содержат ли они одинаковые символы (являются ли анаграммами) и вывести результат.

    // 3. Даны два списка чисел. Необходимо найти разность множеств
    // (элементы, присутствующие только в одном из списков) и вывести результат.
    public static void listDifference(List<Integer> basicList1, List<Integer> basicList2) {

        // [1,1,2,3,4]
        // [2,4,5]
        List<Integer> diff = new ArrayList<>();
        diff.addAll(basicList1.stream()
                .filter(el -> !basicList2.contains(el))
                .distinct()
                .toList());

        diff.addAll(basicList2.stream()
                .filter(el -> !basicList1.contains(el))
                .distinct()
                .toList());

        System.out.println(diff);
    }
    // 4. Дан список слов. Необходимо подсчитать количество слов для каждой длины и вывести результат.

    // 5. Дан список строк. Необходимо отфильтровать строки, которые начинаются с префикса "pre"
    // и заканчиваются суффиксом "post".
    public static void filterString(List<String> list, String pre, String suf) {
        List<String> list1 = list.stream()
                .filter(el -> el.startsWith(pre))
                .filter(el -> el.endsWith(suf))
                .toList();

        System.out.println(list1);
    }

    // 6. Дан список слов. Необходимо подсчитать количество символов в каждом слове и вывести результат.
    public static void countChar(List<String> list) {
        List<Integer> count = list.stream()
                .map(String::length)
                .toList();
        System.out.println(count);
    }

    // 7. Дан список чисел. Необходимо найти среднее значение всех уникальных чисел.
    public static void avgUniqueNum(List<Integer> list) {

        double v = list.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(v);
    }

    // [1,1,2,3]
    // [1,2,3]
    // 1 >> [1,1,2,3]
    public static void avgUniqueNum2(List<Integer> list) {
        Double uniqueElem = list.stream()
                .distinct()
                .filter(num -> list.stream().filter(n -> n.equals(num)).count() == 1)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(uniqueElem);


    }

    // 8. Дан список слов. Необходимо найти самое длинное слово с четной длиной.
    public static void moreEnumLength(List<String> list) {
        String max = list.stream()
                .filter(el -> el.length() % 2 == 0)
                .max(Comparator.comparing(String::length))
                .orElse("null");
        System.out.println(max);
    }

    // 9. Дан список строк. Необходимо удалить все пробелы в каждой строке, отсортировать их в лексикографическом
    // порядке и вывести результат.
    public static void splitDeleteString(List<String> list) {
        List<String> list1 = list.stream()
                .map(el -> el.replace(" ", ""))
                .sorted()
                .toList();
        System.out.println(list1);
    }

    // 10. Дан список слов. Необходимо проверить, являются ли они палиндромами, и вывести результат.
    public static void palindrome(List<String> list) {


        List<String> list1 = list.stream()
                .filter(el -> (new StringBuilder(el).reverse().toString().equals(el)))
                .toList();
        System.out.println(list1);
    }
}
