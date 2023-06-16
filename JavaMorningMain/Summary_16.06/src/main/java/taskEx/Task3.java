package taskEx;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        /*
        4. Найти дубликаты чисел в массиве.
            - целые числа
            - вернуть список в котором будет отображать те, которые дублировались в начальном массиве
            - если пустой - вернуть пустой список (сет)
         */
        /*
        1.
        2.
        3.
         */
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 6, 8, 1};

        System.out.println(findDub(arr));
    }

    public static Set<Integer> findDub(int[] arr) {
        Set<Integer> uniqueDubs = new HashSet<>();
        Set<Integer> items = new HashSet<>();

//        for (int num : arr) {
//            // если мы добавляем элем и такой уже есть, то пишем условие !, что ознает "не true", те false,
//            // то мы добавляем
//            if (!items.add(num)) {
//                uniqueDubs.add(arr[num]);
//            }
//        }
//        return uniqueDubs;
        for (int num : arr) {
            // проверяем, если num есть в items, если есть(выдает true), то записывает в uniqueDubs
            if (items.contains(num)) {
                uniqueDubs.add(num);
            // если нет, то записываем в первый items
            } else {
                items.add(num);
            }
        }
        return uniqueDubs;
    }
}
