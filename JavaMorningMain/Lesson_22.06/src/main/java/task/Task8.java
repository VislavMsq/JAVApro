package task;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        // 1.
        String[] arr = {"one","two","one","three"};
        System.out.println(getString(arr));

        // 2.
        System.out.println(getString(arr));
    }
/*
-Напишите программу, которая принимает массив строк String[] и
возвращает новый массив, содержащий только уникальные строки из исходного массива
 */

    // проитерировать
    // проверить
    // поместить если нет

    // вернуть

    public static List<String> getString(String[] arr){
        //Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for (String str : arr){
            // проверка
            if (!list.contains(str)){
                // добавить если нет такого
                list.add(str);
            }
        }
        return list;
    }
//    public static Set<String> getString2(String[] arr){
//        Set<String> set = new HashSet<>(Arrays.asList(arr));
//        set.hashCode()
//        return set;
//    }
}
