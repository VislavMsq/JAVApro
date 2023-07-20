import java.util.Arrays;
import java.util.List;

public class Ex2 {
    //dropWhile
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 4, 6, 8, 1, 3, 5, 7);
        List<Integer> list = num.stream()
                .dropWhile(el -> el <= 5)
                .toList();
        System.out.println(list);
    }
}
