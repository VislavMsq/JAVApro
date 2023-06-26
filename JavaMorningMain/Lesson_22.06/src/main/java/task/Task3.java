package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank","Clara");

        System.out.println(getTargetName(names, 'C'));

        System.out.println(getTargetName2(names,'C'));





/*
- У вас есть список List<String>, содержащий имена людей.
Напишите программу, которая выводит все имена, начинающиеся на определенную букву.
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
char targetLetter = 'C';
 */
    }

    public static List<String> getTargetName(List<String> names, char targetLetter) {
        List<String> prefName = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith(Character.toString(targetLetter))) {
                prefName.add(name);
            }
        }
        return prefName;
    }

    public static List<String> getTargetName2(List<String> names, char targetLetter) {
        List<String> prefName2 = new ArrayList<>();
        for (String name : names) {
            if (Character.toString(targetLetter).equals(name.substring(0, 1))) {
                prefName2.add(name);
            }
        }
        return prefName2;
    }
}
