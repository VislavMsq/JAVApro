import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    private static int getSumAllElements(List<Integer> list) {

        // i i i i i
        // 1 2 3 4 5
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            // 0 == 0 + 1
            // 1 == 1 + 2
            // 3 == 3 + 4
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println("List size is: " + list.size());

        getSumAllElements(list);
        System.out.println("Sum all elements: " + getSumAllElements(list));
    }
}
