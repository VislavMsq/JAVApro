package List;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    /*
       1. пишем цикл for-each
       2. Выполнить проверку на содержание строки на equals
       3. если строка встречается, вернуть -1
    */
    public static void main(String[] args) {
        // Проверить, содержит ли List<String> заданную строку
        // и вернуть ее индекс. Если строка не найдена, вернуть -1.

        List<String> list = new ArrayList<>();
        list.add("qwe");
        list.add("azx");
        list.add("abc");
        list.add("ert");
        System.out.println(contains(list, "abc"));
    }
    public static int contains(List<String> list, String str){
        for (int i = 0; i < list.size(); i++) {
            if(str.equals(list.get(i))){    // провряем строку на equals с индексом list.get(i)
                return i;                   // возвращает наш индекс
            }
        }
        return -1;
    }
}
