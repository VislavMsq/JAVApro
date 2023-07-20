import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 2, 8, 4, 6, 8, 1, 3, 5, 7,2);
        List<Integer> result = new ArrayList<>();

        numbers.stream()
                .takeWhile(num -> num % 2 == 0)
                .forEach(result::add);

        System.out.println(result);
    }
}
