import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);

        Stream.of(list)
                .flatMap(List::stream)
                .mapMulti((number, consumer) -> {
                    consumer.accept(number * number);
                    consumer.accept(number * number * number);
                }).forEach(System.out::println);

    }
}
