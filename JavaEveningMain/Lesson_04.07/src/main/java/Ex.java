import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 45, 7, 89, 7, 10, 62, 1, 7, 12);

        //max
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        max.ifPresent(v -> System.out.println("Max: " + v));
        System.out.println("----------------------------------------");

        //min
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        min.ifPresent(v -> System.out.println("Min: " + min));
        System.out.println("----------------------------------------");

        //firstFind
        Optional<Integer> first = list.stream().min(Integer::compareTo);
        min.ifPresent(v -> System.out.println("First: " + first));
        System.out.println("----------------------------------------");


    }
}
