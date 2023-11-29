package streamAPI;

import java.util.stream.Stream;

public class SA4 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 23, 7, 8, 12, 55);

//        System.out.println(integerStream.count());
        System.out.println(integerStream.distinct().count());
    }
}
