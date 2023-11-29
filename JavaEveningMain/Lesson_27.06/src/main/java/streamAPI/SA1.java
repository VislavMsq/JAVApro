package streamAPI;

import java.util.Arrays;

public class SA1 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 8, 9, 3, 2, 1};

        /**
         * - Найти все четные числа
         * - далее отсортировать их по возрастанию
         * - далее оставить только уникальные числа
         * - далее умножить каждое число на 10
         * - далее собрать числа в массив
         */

        int[] array = Arrays.stream(arr)   // 4, 5, 6, 7, 8, 8, 9, 3, 2, 1
                .filter(el -> el % 2 == 0) // 4, 6, 8, 8, 2
                .sorted()                  // 2, 4, 6, 8, 8
                .distinct()                // 2, 4, 6, 8
                .map(el -> el * 10)        // 20, 40, 60, 80
                .toArray();                // 20, 40, 60, 80

        System.out.println(Arrays.toString(array));
    }
}
