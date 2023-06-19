package tasks;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
//Проверить, содержит ли List<String> хотя бы
// одну строку, которая начинается с заданного префикса.
        List<String> list = List.of("qwe", "ert", "efg", "erty");
        System.out.println(getPref(list, "er"));
    }

    public static List<String> getPref(List<String> list, String pref) {
        List<String> list1 = new ArrayList<>();
        for (String elem : list) {
            if (elem.startsWith(pref)) {
                list1.add(elem);
            }
        }
        return list1;
    }
}
