package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        // region
        // 1.
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("two");
        list.add("three");
        list.add("three");


        System.out.println(isContains(list, "a"));

        // 2.
        Set<Integer> set = Set.of(12, 10, 19, 14);
        System.out.println(enumSum(set));

        // 3.
        System.out.println(isPrefixContains(list, "qw"));

        // 4.
        combination(list, set);

        // 5.
        System.out.println(getDubList(list));

        // endregion
    }
    // region Проверить, содержит ли List<String> заданную строку
    //Проверить, содержит ли List<String> заданную строку
    // и вернуть ее индекс. Если строка не найдена, вернуть -1.

    public static Integer isContains(List<String> list, String str) {
        return list.indexOf(str);       // indexOf - есть цикл, итерируется по элементам
    }


    // endregion
    // region Найти сумму всех элементов в Set<Integer>, которые являются четными числами.
    public static Integer enumSum(Set<Integer> set) {
        int en = 0;

        for (Integer num : set) {
            if (num % 2 == 0) {
                en += num;
            }
        }
        return en;
    }

    // endregion
    // region  Проверить, содержит ли List<String> хотя бы одну строку которая начинается с заданного префикса
    public static boolean isPrefixContains(List<String> list, String str) {
        for (String s : list) {
            if (s.startsWith(str)) {
                return true;
            }
        }
        return false;
    }
    // endregion
    // region Получить все возможные комбинации из List<String> и Set<Integer>, где каждая комбинация представляет собой строку и число, объединенные вместе
    public static void combination(List<String> list, Set<Integer> set) {
        for (String str : list) {
            for (Integer num : set) {
                System.out.println(str + num);
            }
        }
    }

    // endregion
    // region Найти все дубликаты в List<String> и вернуть их в виде нового списка.
    public static List<String> getDubList(List<String> list) {
        Set<String> set = new HashSet<>(list);
        List<String> dubList = new ArrayList<>();

        for (String s1 : set) {
            int num = 0;
            for (String l1 : list) {
                if (s1.equals(l1)) {
                    num++;
                    if (num > 1) {
                        dubList.add(s1);
                    }
                }
            }
        }
        return dubList;
    }
    // endregion

}
