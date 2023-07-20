import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    public static void main(String[] args) {
//        List<Integer> num = Arrays.asList(1, 2, 3, 4, 6, 8, 1, 3, 5, 7);
//        num.stream()
//                .collect(Collectors.groupingBy(el -> el % 3));

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 6, 8, 1, 3, 5, 7);
        num.stream()
                .collect(Collectors.partitioningBy(el -> el % 2 == 0));
    }
}
