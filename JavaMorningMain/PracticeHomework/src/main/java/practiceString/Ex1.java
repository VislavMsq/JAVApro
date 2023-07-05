package practiceString;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.LongToIntFunction;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 2, 8, 3);
        List<String> strList = List.of("zxc", "zmb", "dcm", "cmb", "zbs");

        // 1.
        getSymStream(list);

        // 2.
        filterString(strList, "z");

        // 3.
        doubleNumArray(list);

        // 4.
        getMaxNum(list);

        // 5.
        getUniqueElem(list);


    }

    /**
     * 1.Задача: Подсчет суммы чисел в списке
     * Условие: Дан список целых чисел. Напишите программу, которая найдет сумму всех чисел в списке, используя Stream API.
     */

    public static void getSymStream(List<Integer> list) {

        int sum = list.stream()
                .mapToInt(Integer::intValue) // преобразовует каждое число в примитив int
                .sum();

        System.out.println("Sum - > " + sum);
    }

    /**
     * 2.Задача: Фильтрация списка строк
     * Условие: Дан список строк. Напишите программу, которая отфильтрует строки, оставив только те, которые начинаются с определенной буквы или символа, используя Stream API.
     */

    public static void filterString(List<String> list, String filter) {
        List<String> strList = list.stream()
                .filter(el -> el.startsWith(filter)) // "zxc" -> true, "zmb", "dcm", "cmb", "zbs"
                .toList();
        System.out.println(strList);
    }

    /**
     * 3.Задача: Удвоение всех чисел в списке
     * Условие: Дан список целых чисел. Напишите программу, которая удвоит каждое число в списке, используя Stream API,
     * и вернет новый список с удвоенными значениями.
     */

    public static void doubleNumArray(List<Integer> list) {
        List<Integer> listDub = list.stream()
                .map(el -> el * 2)
                .toList();

        System.out.println(listDub);
    }

    /**
     * 4.Задача: Поиск наибольшего числа в списке
     * Условие: Дан список целых чисел.
     * Напишите программу, которая найдет наибольшее число в списке, используя Stream API.
     */
    public static void getMaxNum(List<Integer> list) {
        OptionalInt max = list.stream() // OptionalInt - контейнер int, если пустой выдает false, если есть елемент, то выдает результат
                .mapToInt(Integer::intValue)
                .max();


        if (max.isEmpty()) {
            System.out.println("null");
        } else {

//            System.out.println(max)            -> OptionalInt[5]
//            System.out.println(max.getAsInt()) -> 5

            System.out.println(max.getAsInt());
        }
    }

    /**
     * 5.Задача: Подсчет количества уникальных элементов в списке
     * Условие: Дан список элементов.
     * Напишите программу, которая подсчитает количество уникальных элементов в списке, используя Stream API.
     **/

    public static void getUniqueElem(List<Integer> list) {
        long count = list.stream()
                .distinct()
                .count();
//        LongToIntFunction
        System.out.println(count);
    }
}
