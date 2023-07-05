package task;

import java.util.Arrays;

public class Task {
    //    1.Посчитать сумму всех простых чисел в заданном диапазоне.
    //    2.Проверить, является ли заданная строка изограммой (все буквы в строке уникальные).
    //    3.Найти наибольшую возрастающую последовательность в заданном массиве чисел.
    //    4.Найти индекс первого вхождения заданного элемента в массиве.
    //    5.Поменять местами минимальный и максимальный элементы в массиве.
    //    6.Посчитать количество положительных и отрицательных элементов в массиве.


    public static void main(String[] args) {
        createArray(Task::reverseArray);
    }

    public static void reverseArray(int[] arr) {
        // new arr
        int[] reversed = new int[arr.length];
        // int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - i - 1] = arr[i];

            // ->
            // [n,n,n,n]
            //        <-
            // [n,n,n,n]

            // f(x)
            // -f(x)

            //    f(x) | -f(x)
            //     /   |   \
            //    /    |    \
            //   /     |     \

            // arr1[i] >>> arr2[-i]
            //  i - 0
            // -i - 4
        }
        System.out.println("basic array -> " + Arrays.toString(arr) + "\nreversed array -> " + Arrays.toString(reversed));
    }

    //    8.Перевернуть массив задом наперед.
    public static void createArray(Te te) {
        int[] arr = {1, 2, 3, 4, 5};
        te.get(arr);
    }
}

@FunctionalInterface
interface Te {
    void get(int[] arr);
}
