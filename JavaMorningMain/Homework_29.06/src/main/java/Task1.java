import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = List.of("qwewww", "as", "zxc", "rty", "aaaa", "bbbb", "bbbb", "cccc");
        List<String> list2 = List.of("qwe", "qwe", "zxc", "rty", "zxc", "bbb", "ccp");

        List<Integer> integerList = List.of(-5, -2, -1, 5, 6, 0, 3, 4);
        List<Integer> basicList = List.of(5, 2, 1, 3, 6);

        // 1.
        getWordWorks(list);

        // 2.
        findLengthStartWith(list, "a");

        // 3.
        groupSize(list);

        // 4.
        findMinInt(integerList);

        // 5.
        findSquareSum(basicList);

        // 6.
        mergeArray(integerList, basicList);

        // 7.
        uniqueSimb(list2);

        // 8.
        secondMax(integerList);

        // 9.

        // 10.
        mergeArrayWork(list2);




    }


    // 1. Дан список строк. Необходимо отфильтровать строки, длина которых больше 3 символов,
    // преобразовать их в верхний регистр, удалить повторяющиеся и вывести результат в отсортированном порядке.
    public static void getWordWorks(List<String> list) {
        List<String> list1 = list.stream()
                .filter(el -> el.length() > 3)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .toList();
        System.out.println(list1);
    }

    // 2. Дан список слов. Необходимо найти среднюю длину слов, начинающихся с буквы "A".

    // check A
    // length
    // tolist

    public static void findLengthStartWith(List<String> list, String target) {
        OptionalDouble list1 = list.stream()
                .filter(el -> el.startsWith(target))
                .mapToInt(String::length)
                .average();

        //                   boolean       if ->      else ->
        System.out.println(list1.isEmpty() ? "null" : list1.getAsDouble());
    }

    // 3. Дан список слов. Необходимо сгруппировать их по длине и вывести результат.
    public static void groupSize(List<String> list) {
        String string = list.stream()
                .collect(Collectors.groupingBy(String::length))
                .toString();
        System.out.println(string);
    }

    // 4. Дан список чисел. Необходимо найти наименьшее число, больше 0.
    public static void findMinInt(List<Integer> list) {
        Optional<Integer> num = list.stream()
                .filter(el -> el > 0)
                .sorted()
                .findFirst();

        System.out.println(num.isEmpty() ? "null" : num.get());
    }

    // 5. Дан список чисел. Необходимо найти сумму квадратов всех положительных чисел.
    public static void findSquareSum(List<Integer> list) {
        int sum = list.stream()
                .filter(el -> el > 0)
                .map(el -> el * el)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }

    // 6. Даны два списка чисел. Необходимо объединить их в один список, отсортировать по убыванию
    // и удалить повторяющиеся элементы.
    public static void mergeArray(List<Integer> list1, List<Integer> list2) {
        List<Integer> dobArr = Stream.concat(list1.stream(), list2.stream())
                .distinct()
                //
                .sorted((el1, el2) -> el2 - el1)
                .toList();
        System.out.println(dobArr);
    }
    // 7. Дан список строк. Необходимо оставить только уникальные символы из всех строк и вывести их в алфавитном порядке.

    // 1,1,2,3,4
    // 2,3,4

    public static void uniqueSimb(List<String> list) {
        List<String> list1 = list.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println(list1);
    }

    // 8. Дан список чисел. Необходимо найти второе максимальное число.
    public static void secondMax(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .toList();

        System.out.println(list1.size() == 0 ? "null" : list1.get(0));
    }
    // 9. Дан список слов. Необходимо отфильтровать слова, состоящие только из букв,
    // разделить их на гласные и согласные, и вывести результат.

    // 10. Дан список строк. Необходимо удалить пустые строки, объединить оставшиеся строки в одну строку,
    // разделенную запятой.
    public static void mergeArrayWork(List<String> list) {
        String collect = list.stream()
                .filter(el -> el.length() != 0)
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }


}
