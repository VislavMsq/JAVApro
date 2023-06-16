package task;

import java.util.HashMap;
import java.util.Map;

public class Task1 {


    public static void main(String[] args) {
        getKey();
        getValue();
        searchSecond();
        getKeyWithValues();
        getWordStartWithV();
        getMaxNum();
    }

    public static void getKey() {
//    Задача 3 (сложность 3 из 10):
//    Создать и заполнить Map<Integer, String>. Вывести на экран все ключи, находящиеся в мапе.
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "true");
        map.put(2, "false");
        map.put(3, "true");
        map.put(4, "false");
        map.put(5, "true");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey());  // выводим ключ
        }
    }

    //    Задача 4 (сложность 4 из 10):
//    Создать и заполнить Map<Integer, String>. Вывести на экран все значения, находящиеся в мапе.
    public static void getValue() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "true");
        map.put(2, "false");
        map.put(3, "true");
        map.put(4, "false");
        map.put(5, "true");

        for (String m : map.values()) {
            System.out.println(m);   // выводим значение
        }
    }

    //    Задача 4 (сложность 4 из 10):
//    Создать и заполнить Map<Integer, String>. Проверить, содержится ли в мапе ключ 2. Если да, вывести соответствующее значение.
    public static void searchSecond() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Значение 1");
        map.put(2, "Значение 2");
        map.put(3, "Значение 3");

        if (map.containsKey(2)) {
            String str = map.get(2);
            System.out.println("Have this key -> " + str);
        } else {
            System.out.println("do not have this key");
        }
    }

    //    Задача 4 (сложность 4 из 10):
//    Создать и заполнить Map<Integer, String>. Вывести на экран все пары ключ-значение, находящиеся в мапе.
    public static void getKeyWithValues() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Значение 1");
        map.put(2, "Значение 2");
        map.put(3, "Значение 3");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m);  // выводим ключ
        }
    }

//    Задача 4 (сложность 4 из 10):
//    Создать и заполнить Map<Integer, String>. Подсчитать количество значений, которые начинаются с буквы "V".
    public static void getWordStartWithV() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Значение 1");
        map.put(2, "Значение 2");
        map.put(3, "VЗначение 3");

        int count = 0;
        for (String m : map.values()) {
            if (m.startsWith("V")) {
                count++;
            }
        }
        System.out.println("Amount of values start with V: " + count);
    }
//    Задача 5 (сложность 5 из 10):
//    Создать и заполнить Map<Integer, String>. Найти ключ с наибольшим значением и вывести его на экран.
    public static void getMaxNum() {
        Map<Integer, String> map = new HashMap<>();
        int max = 0;
        map.put(1, "Значение 1");
        map.put(2, "Значение 2");
        map.put(3, "VЗначение 3");

        for (Integer num : map.keySet()){
           if(max < num){
               max = num;
           }
        }
        System.out.println("Max: " + max);
    }
}
