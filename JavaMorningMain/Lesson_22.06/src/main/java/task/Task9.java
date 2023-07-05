package task;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        String[] arr = {"One", "Two", "Three", "Four"};

        System.out.println(getReverseWord(arr));
    }

    /*
    -Напишите программу, которая принимает массив строк String[]
    и возвращает новый массив строк, в котором все строки перевернуты задом наперёд.
     */


    // проітерувати
    // обернути строку массива One -> enO
    //
    public static List<String> getReverseWord(String[] arr) {
        List<String> list = new ArrayList<>();
        for (String str : arr) {
            StringBuilder stringBuilder = new StringBuilder(str);
            StringBuilder build = stringBuilder.reverse(); // -> return new Object
            list.add(build.toString());
        }
        return list;
    }
}
