import java.util.Optional;

public class Lesson {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("!");
        if (optional.isPresent()){      // проверка наличия
            String name = optional.get();
            System.out.println("Param: " + name);
        }else {
            System.out.println("Name is not valid");
        }
    }
}
