package example1;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    // Напишите программу на Java, которая проверяет, содержит ли заданное
// множество только нечетные числа. Множество представлено массивом целых чисел.
    public static void main(String[] args) {
        int[] arr = {4, 2, 12, 19, 4, 6, 10};

        boolean checOdd = getOddNum(arr);

        if (checOdd){
            System.out.println("Arrays have odd numbers");
        }else {
            System.out.println("Arrays don't have odd numbers");
        }

    }

    public static boolean getOddNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){
                return true;
            }
        }
        return false;
    }
}
