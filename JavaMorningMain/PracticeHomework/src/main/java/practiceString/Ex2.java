package practiceString;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, -1, 4, -2, 5, -3);

        List<String> list1 = List.of("f", "j", "d", "v", "x", "z");

        List<String> list2 = List.of("fhgfd", "jfg", "db", "vrbrff", "xbgfvd", "zfvv");
        //1.
        getPosNum(list);

        //2.
        sortList(list1);

        //3.
        SLToLL(list2);

        //4.
        getEnumNum(list);

        //5.
        getUpper(list2);

        //6.
        getAvg(list);

        //7.
        sort(list);

        //8.
        filterBySize(list2);
    }

    //1. Посчитать количество положительных чисел в списке.
    public static void getPosNum(List<Integer> list) {
        long count = list.stream()
                .filter(el -> el > -1)
                .count();
        System.out.println("count positive numbers -> " + count);
    }

    //2. Отсортировать список строк в алфавитном порядке.
    public static void sortList(List<String> list) {
        List<String> list1 = list.stream()
                .sorted()
                .toList();
        System.out.println(list);
    }

    //3. Преобразовать список строк в список их длин.
    public static void SLToLL(List<String> list) {
        List<Integer> list1 = list.stream()
                .map(String::length)
                .toList();

        System.out.println(list1);
    }

    //4. Отфильтровать список чисел, оставив только четные числа.
    public static void getEnumNum(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .filter(el -> el % 2 == 0)
                .toList();
        System.out.println("Enum list -> " + list1);
    }

    //5. Преобразовать список строк в список их заглавных версий.
    public static void getUpper(List<String> list) {
//        List<String> list1 = list.stream() // Caps list
//                .map(String::toUpperCase)
//                .toList();

        List<String> list1 = list.stream() // Capitalise list
                .map(el -> el.substring(0, 1).toUpperCase() + el.substring(1)) // [a,b,v,d,e,f]
                // [A] | [b,v,d,e,f]
                // [A] + [b,v,d,e,f]
                .toList();

//                .flatMap(el -> {
//                    String[] el1 = el.split("");
//                    el1[0] = el1[0].toUpperCase();
//                    el = String.join("",el1);
//                    return Stream.of(el);
//                })
//                .toList();

        System.out.println("Capitalise list -> " + list1);
    }

    //6. Найти среднее значение списка чисел.
    public static void getAvg(List<Integer> list) {
        int num = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println((double) num / list.size());
    }
    //10. Отсортировать список чисел по их возрастанию.
    public static void sort(List<Integer> list){
        List<Integer> list1 = list.stream()
                .sorted()
                .toList();

        System.out.println(list1);
    }
// 11. Отфильтровать список строк, оставив только строки длиной больше 5 символов.
    public static void filterBySize(List<String> list){
        List<String> list1 = list.stream()
                .filter(el -> el.length() > 5)
                .toList();

        System.out.println(list1);
    }
}
