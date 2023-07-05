package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(88);
        list.add(22);
        list.add(33);
        list.add(11);

//        list.stream()
//                .forEach(System.out::println);

        int[] arr = {1, 8, 3, 4, 5, 6, 7, 2, 9};

//        Arrays.stream(arr)
//                .forEach(el -> System.out.println(el));     // изначальное выражение
//                .forEach(System.out::println);

        Stream<Integer> stream = Stream.of(1, 2, 2, 3, 4, 5, 6);
//        stream.forEach(el -> System.out.println(el));
        System.out.println(stream.count());     // кл-во элементов
        System.out.println(stream.distinct().count());  // кл-во уникальных элементов
    }
}
