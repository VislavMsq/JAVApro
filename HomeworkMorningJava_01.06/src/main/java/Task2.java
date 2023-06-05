import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Task2 {
    public static void main(String[] args) {
/*
Напишите параметризированный класс "Pair", который принимает два различных типа данных в
качестве параметров (например, "Pair"). Реализуйте методы для получения и установки значений каждого
из элементов пары.
 */
        Pair<String , Integer> pair = new Pair<>("First", 123);
        String first = pair.getFirst();
        Integer second = pair.getSecond();

        pair.setFirst("Hello");
        pair.setSecond(321);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }

}

@Getter
@Setter
@AllArgsConstructor

class Pair<Q, W> {
    private Q first;
    private W second;
}