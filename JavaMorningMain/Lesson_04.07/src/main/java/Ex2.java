import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Vlad","Elena","Dima");
        List<String> list1 = list.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .toList();
        System.out.println(list1);
    }
}
