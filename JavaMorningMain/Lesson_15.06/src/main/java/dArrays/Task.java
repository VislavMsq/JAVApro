package dArrays;

public class Task {
    public static void main(String[] args) {
        /*
         * 1. Найти сумму всех элементов в каждой
         * строке двумерного массива и вывести на экран.
         *
         */

        // нашли сумму всех элементов

        int[][] arr = {{2, 4, 6}, {4, 5, 7}, {9, 0, 3}};

        int [] sum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum [i] += arr[i][j];
            }
            System.out.println(sum[i]);
        }

//        int[][] arr = {{1, 2}, {4, 5}, {7, 8}};
//        System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//
//        }
    }

}
