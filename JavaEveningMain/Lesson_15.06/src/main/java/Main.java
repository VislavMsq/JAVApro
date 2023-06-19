import java.time.Period;
import java.time.chrono.ChronoPeriod;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        String key = "key"; //KEY
        Integer value = 10;

        map.put(key, value);
        System.out.println("Value associated with key: " + map.get(key));

        key = key.toUpperCase();

        System.out.println("Value associated with changed key: " + map.get(key));
    }
}
