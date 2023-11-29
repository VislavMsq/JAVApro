package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SA2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(122);
        list.add(132);
        list.add(512);
        list.add(162);
        list.add(2);

        List<Integer> integerList = list.stream()
                .filter(el -> el % 2 == 0)
                .sorted()
                .distinct()
                .map(el -> el * 10)
                .toList();

        System.out.println(integerList);
    }
}
