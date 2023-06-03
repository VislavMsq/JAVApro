package example1;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    // Реализуйте метод на Java, который принимает на вход два множества целых
// чисел и возвращает новое множество, содержащее все элементы из обоих исходных множеств без повторений.
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 9};
        int[] arr2 = {2, 3, 4, 6, 8, 9};

        Set<Integer> newArrays = getArray(arr,arr2);
        System.out.println(newArrays);
    }

    public static Set<Integer> getArray(int[] arr, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int newArr : arr) {
            set.add(newArr);
        }
        for (int newArr2 : arr2) {
            set.add(newArr2);
        }
        return set;
    }
}
