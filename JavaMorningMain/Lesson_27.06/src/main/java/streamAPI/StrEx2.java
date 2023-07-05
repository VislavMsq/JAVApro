package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StrEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(123);
        list.add(132);
        list.add(100);

        list.stream()
                .filter(el -> {
                    System.out.println("@@@@@@@@");
                    return el % 2 == 0;
                }).collect(Collectors.toList());
    }
}
