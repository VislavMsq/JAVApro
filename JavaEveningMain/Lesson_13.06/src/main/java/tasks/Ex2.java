package tasks;

import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        //Проверить, содержит ли List<String> заданную строку
        // и вернуть ее индекс. Если строка не найдена, вернуть -1.
        List<String> list = List.of("qwe", "asd", "qwe", "zxc");

        System.out.println(contains(list, "qwe"));
    }

    public static int contains(List<String> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
