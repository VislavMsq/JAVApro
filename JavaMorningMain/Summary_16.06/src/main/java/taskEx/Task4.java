package taskEx;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        // 5. Дан массив чисел в отсортированном порядке (от меньшему к большему).
        // Нужно вывести квадраты этих чисел в отсортированном порядке.

        // целые числа
        // могут быть отрицательные
        //

        int[] arr = {-10, -5, 0, 3, 4, 6};
        printSortedSquares(arr);
    }

    // ульра сложное решение
    public static void printSortedSquares2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            map.merge(Math.abs(j), 1, Integer::sum);
        }

        map.forEach((k, count) -> {
            for (int i = 0; i < count; i++) {
                System.out.println(k * k);
            }
        });
    }

    // еще одно решение
    public static int[] squaredSorted(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * arr[i];
        }
        Arrays.sort(result);
        return result;
    }

    // решение от преподавателя, самое эффективное
    public static void printSortedSquares(int[] arr) {
        int minAbs = Integer.MIN_VALUE;
        int minAbsIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int abs = Math.abs(arr[i]);
            if (abs < minAbs) {
                minAbs = abs;
                minAbsIndex = i;
            }
        }
        int right = minAbsIndex;
        int left = minAbsIndex - 1;
        for (int i = right, j = left; i < arr.length; i++) {
            while (right < arr.length || left >= 0) {
                if (left < 0) {
                    System.out.println(arr[right] * arr[right]);
                    right++;
                    continue;
                }
                if (right == arr.length) {
                    System.out.println(arr[left] * arr[left]);
                    left--;
                    continue;
                }
                if (arr[left] * arr[left] <= arr[right] * arr[right]) {
                    System.out.println(arr[left] * arr[left]);
                    left--;
                } else {
                    System.out.println(arr[right] * arr[right]);
                    right++;
                }
            }
        }
    }
}
