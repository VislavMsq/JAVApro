import java.util.HashMap;
import java.util.Map;

public class Lesson {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        int[] nums = new int[]{2, 2, 3, 4, 5, 5, 6, 8, 9};

        // HashMap 0(2 * n) == 2 * 0(n) == 0(n)
        // TreeMap 0(n * log(n))
        for (int num : nums) {
            Integer count = hashMap.get(num);
            hashMap.put(num, (count == null ? 1 : count + 1));
        }
        System.out.println(hashMap);
    }
}
