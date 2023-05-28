package arrays;

public class Task5 {
    public static void main(String[] args) {
// Задача 3 (Уровень сложности: 5):
// Напишите программу, которая находит второй по величине элемент в заданном массиве.
        int[] arr = {16, 4, 51, 33, 2, 87, 11, 42, 9};
        int maxFirst = arr[0];  //16 -> 51
        int maxSecond = arr[0]; //16 -> 33
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxFirst){
                maxSecond = maxFirst;   // 16 -> 33 -> 51
                maxFirst = arr[i];      // 51 -> 87
        } else if (arr[i] > maxSecond) {
                maxSecond = arr[i];     // 16 -> 33 -> 51
            }
        }
        System.out.println("maxFirst " + maxFirst);
        System.out.println("maxSecond " + maxSecond);
    }
}
