package taskEx;

public class Task2 {
    public static void main(String[] args) {
        // 2. Найти максимальный элемент в двумерном массиве.
        // целые числа
        // если массив пусто -> вывести число 1
//        int [][] arr = {
//                {1,2,3},
//                {1,2,5}
//        };
        int[][] arr = {
                {-1, -2, -3},
                {-1, -2, -5, 10},
                {-1, -2, -5}
        };
        System.out.println(findMax(arr));

    }

    public static int findMax(int[][] arr) {
        if (arr.length == 0) {       // проверка на пустоту массива
            return -1;
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {              // перебираем строки
            for (int j = 0; j < arr[i].length; j++) {       // определенная конструкция перебора, перебираем колонки
                if (arr[i][j] > max) {                      // если поменять на [j][i] - то будем искать в обратную сторону
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
