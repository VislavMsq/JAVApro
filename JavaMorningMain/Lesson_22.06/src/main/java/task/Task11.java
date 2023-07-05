package task;

import java.util.HashSet;
import java.util.Set;

public class Task11 {
    public static void main(String[] args) {
        Set<String> set = Set.of("a", "b", "c", "d", "e");
        Set<String> set2 = Set.of("a", "f", "b", "g", "d");

        System.out.println(getDublSet(set, set2));
    }


    // 1011001
    // 0101101
    // logic and &
    // 0001001


    /*
    -Напишите функцию, которая принимает на вход два Set<String> и
    возвращает новый Set<String>, содержащий только те строки, которые присутствуют в обоих наборах.
     */
    public static Set<String> getDublSet(Set<String> set, Set<String> set2) {
        Set<String> stringSet = new HashSet<>();
        for (String str : set){
            for (String str2 : set2){
                if (str.equals(str2)){
                    stringSet.add(str);
                }
            }
        }
        return stringSet;
    }
}
