import java.util.LinkedList;
import java.util.Queue;

public class Lesson {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("W");
        queue.add("A");
        queue.add("F");
        queue.add("T");
        queue.add("U");

        System.out.println(queue);
    }
}
