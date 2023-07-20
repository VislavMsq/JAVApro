import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);

        Stream<Integer> stream = list.parallelStream().sequential();
        System.out.println(stream);
    }
}
