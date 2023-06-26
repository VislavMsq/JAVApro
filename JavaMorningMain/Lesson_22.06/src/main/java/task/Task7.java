package task;

public class Task7 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2 },
                       {4, 5, 6},
                       {7, 8, 9, 12, 3}};

        System.out.println(getSum(arr));
        System.out.println(getMax(arr));
    }
// region -Напишите программу, которая принимает на вход двумерный массив int[][] и возвращает сумму всех элементов в массиве


    public static int getSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {       // arr[i].length - [i] - длинна подмассива
                sum += arr[i][j];
            }
        }
        return sum;
    }
    // endregion
// region Напишите программу, которая принимает на вход двумерный массив и возвращает максимальное значение среди всех элементов в массиве.

    public static int getMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {       // arr[i].length - [i] - длинна подмассива
               if(arr[i][j] > max) max = arr[i][j];
            }
        }
        return max;
    }
    // endregion
}
