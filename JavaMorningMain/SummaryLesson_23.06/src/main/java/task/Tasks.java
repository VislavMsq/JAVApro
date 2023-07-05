package task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tasks {
    public static void main(String[] args) {
        // 1.
        int[] arr = {2, 7, 5, 3, 8, 1, 1, 1, 1, 7, 7, 5, 5, 5, 2};
        int[] arr2 = {-2, -7, -5, -3, -8, -1};
        int[] arr3 = {-2, -7, -5, -3, 8, -1};
        int[] arr4 = {8};
        System.out.println(getAvgSum(arr4));

        // 2.
        int[][] arr2D = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println(Arrays.toString(arrSumColons(arr2D)));

        // 3.
        getCountDupl(arr);

    }

//region 1. Дан массив целых чисел. Нужно найти наибольшую разницу между двумя элементами массива
    public static int getAvgSum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }

    // еще вариант решения
    public static int getAvgSum2(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min; // от самого большого отнимаем самое маленькое
    }

    // endregion
// region 2. Дан двумерный массив из N строк. Нужно найти для каждой строки сумму всех значений колонок
    public static int[] arrSumColons(int[][] array2D) {
        if (array2D.length == 0) {
            return new int[]{};
        }
        int[] result = new int[array2D.length];
        for (int i = 0; i < array2D.length; i++) {
            int sum = 0;
            for (int j = 0; j < array2D[i].length; j++) {
                sum += array2D[i][j];
            }
            result[i] = sum;
        }
        return result;
    }

    // endregion
//region 3.Найти все повторы в массиве, но вывести на экран только те, которые повторяются 3 и более раз.
    public static void getCountDupl(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
//            map.merge(num, 1, Integer::sum); - если нет - добавляет, если есть - прибавляет значение value
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {      // цикл по map - линейный O(n)
            if (entry.getValue() >= 3) {
                System.out.println("число " + entry.getKey() + " повторяется " + entry.getValue() + " раза");
            }
        }
    }
// endregion
// region 4. Очередь. Добавить N элементов из целых чисел. Удалить отрицательные элементы из начала очереди и вывести их на экран.

}
