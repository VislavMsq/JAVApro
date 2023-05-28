package arrays;

public class Task3 {
    public static void main(String[] args) {
// Напишите программу, которая находит сумму всех элементов в заданном массиве.+
        int sum = 0;
        int[] arr = {4, 19, 33, 11, 5, 14};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
