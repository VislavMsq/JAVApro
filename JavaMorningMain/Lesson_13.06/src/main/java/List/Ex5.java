package List;

import java.util.List;

public class Ex5 {
    //Проверить, содержит ли List<String> хотя бы
    // одну строку, которая начинается с заданного префикса.

    /*
    1. пройтись циклом
    2. startWith - если строка начинается с заданного префикса, то вернем эту строку  и выйдем из цикла
    3.
     */
    public static void main(String[] args) {
        System.out.println(getPref(List.of(  // метод создает лист фикс. и передаем префикс , т.е элемент
                "qwer",
                "asdf",
                "zxc"
        ), "zx"));
    }

    public static String getPref(List<String> list, String pref) {
        for (String str : list) {
            if (str.startsWith(pref)) {         // метод для проверки префикса, передаем префикс
                return str;
            }
        }
        return null;
    }
}
