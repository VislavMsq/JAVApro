package streamAPI;

import java.util.Arrays;
import java.util.Collection;

public class SA5 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 8, 9, 3, 2, 1};

        int[] df = Arrays.stream(arr)
                .filter(el -> {
                    System.out.println("!!!");
                    return el % 2 == 0;
                }).toArray();
    }
}
