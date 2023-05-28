package arrays;

public class Task4 {
    public static void main(String[] args) {
// Задача 2 (Уровень сложности: 5):
// Напишите программу, которая находит наименьшее и наибольшее значение в заданном массиве.

        int[] arr = {55, 31, 64, 32, 3, 11, 95, 2, 77};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }  if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}

