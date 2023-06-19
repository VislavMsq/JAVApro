import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mapFamily = new HashMap<>();
        mapFamily.put(1, "A");
        mapFamily.put(2, "S");
        mapFamily.put(3, "F");
        mapFamily.put(4, "B");
        mapFamily.put(5, "R");
        mapFamily.put(6, "N");

        for (Map.Entry<Integer, String> m :mapFamily.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

    }
}
