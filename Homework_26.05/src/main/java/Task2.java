public class Task2 {
    public static void main(String[] args) {
//Задача 6 (Уровень сложности: 3):
//Напишите программу, которая суммирует только положительные элементы в заданном массиве.
        int posNum = 0;
        int[] arr = {-5, 7, 21, -4, 11, -90, 13, 19};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posNum += arr[i];
            }
        }
        System.out.println(posNum);
    }
}
