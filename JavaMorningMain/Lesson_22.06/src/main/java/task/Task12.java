package task;

import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("banana");
        stringSet.add("apple");
        stringSet.add("Banana");

        System.out.println(getIgnoreCase(stringSet));
    }

    /*
    - Напишите функцию, которая принимает на вход Set<String> и возвращает
    новый Set<String>, содержащий только уникальные строки, игнорируя регистр символов
    Set<String> stringSet = new HashSet<>();
    stringSet.add("Apple");
    stringSet.add("banana");
    stringSet.add("apple");
    stringSet.add("Banana");
     */


    // получити строку
    // зменшити регістр
    // додати в новий сет

    public static Set<String> getIgnoreCase(Set<String> stringSet) {
        Set<String> set = new HashSet<>();
        for (String str : stringSet){
          set.add(str.toLowerCase());   // перевели в нижний регистр и добавили в set
        }
        return set;
    }
}
