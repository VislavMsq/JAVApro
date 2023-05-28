package arrays;


public class Task6 {
// Задача 5 (Уровень сложности: 6):
// Напишите программу, которая проверяет, является ли заданный массив палиндромом. Палиндром - это массив,
// который читается одинаково вперед и назад.

    public static void main(String[] args) {
        int[] arr = {44, 11, 25, 6, 3, 3, 6, 25, 11, 44};
        int[] arr2 = {44, 11, 25, 6, 1, 3, 6, 25, 11, 44};

        System.out.println(arrWork(arr));
        System.out.println(arrWork(arr2));
    }

    public static boolean arrWork(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            if (arr[i] != arr[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}