import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vlad");
        names.add("Nick");
        names.add("Mick");
        names.add("V");

        names.stream()
                .filter(name -> name.startsWith("V"))
                .onClose(() -> System.out.println("Stream closed"))
                .forEach(System.out::println);

        names.stream()
                .filter(name -> name.startsWith("B"))
                .onClose(() -> closeStream(names))
                .forEach(System.out::println);
    }

    private static void closeStream(List<String> names) {
        System.out.println("Stream closed");
        names.clear();
    }
}
