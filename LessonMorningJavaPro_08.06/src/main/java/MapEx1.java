import java.util.*;

public class MapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Evk");
        map.put(2, "null");
        map.put(3, "@@@");

        for (Map.Entry<Integer, String> m : map.entrySet()) { // так делается перебор мапы
            System.out.println(m);
            System.out.println("Key [" + m.getKey() + "] : Value [" + m.getValue() + "]");
        }

        int[] ae = {1, 2, 3, 4, 5};

        for (int i = 0; i < map.size(); i++) {

        }


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(22);
        set.add(32);
        set.add(244);


        for (Integer in : set) {
            System.out.println(in);
        }
    }
}
