package task;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {
        Set<String> set = Set.of("One", "two", "three", "Four");

        System.out.println(getCapitalise(set));
/*
-Напишите функцию, которая принимает на вход Set<String>
и возвращает новый Set<String>, содержащий только те строки, которые начинаются с заглавной буквы.
 */
    }

    //  Set<String> -> Set<String>
    //  [One, two, Three, Four] -> [One, Three]
    // One -> O | O -> O | One -> O == O
    // two -> t | t -> T | two -> t == T


    // взять первую букву
    // сделать ее большой
    // сравнить с итерируемыми буквами в начале

    public static Set<String> getCapitalise(Set<String> set) {
        Set<String> capitalise = new HashSet<>();
        // если функция выполняет действия и что-то передает, то искомое значение не меняется, т.е str
        for (String str : set) {
            // если функция что-то перадет, то ее значение нужно присвоить
            String s = Character.toString(str.charAt(0));     // charAt - достал индекс нашей первой буквы
            String s1 = s.toUpperCase();    // перевели в верхний регистр
            if (s.equals(s1)){
                capitalise.add(str);
            }
        }
        return capitalise;
    }
}
