package streamAPI;

import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Stream;

public class SA3 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 23, 7, 8, 12, 55);

        Object[] s =  integerStream
                .filter(el -> el % 2 == 0)
                .sorted()
                .distinct()
                .map(el -> el * 10)
                .toArray();

    }
}
