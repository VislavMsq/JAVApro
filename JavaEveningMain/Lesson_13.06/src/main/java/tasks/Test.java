package tasks;

import java.util.*;

import static java.util.Collections.list;

public class Test {
    public static void main(String[] args) {
//Найти все дубликаты в List<String> и вернуть их в виде нового списка.
        List<String> list = List.of("one","two","one","three","two");
        List<String> list2 = findDup(list);
        System.out.println("Unique -> " + list2);

    }
    public static List<String> findDup(List<String> list) {
        List<String> dub = new ArrayList<>();
        Set<String> uniq = new HashSet<>();

        for (String elem : list){
            if(!uniq.add(elem)){
                dub.add(elem);
            }
        }
        return dub;
    }
}
