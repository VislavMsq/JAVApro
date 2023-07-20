import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        List<String> list = list1.stream()
                .flatMap(i -> list2.stream()
                        .flatMap(j -> list2.stream()
                                .map(k -> "(" + i + ", " + i + ", " + k + ")")))
                .toList();
        System.out.println(list);
    }
}
