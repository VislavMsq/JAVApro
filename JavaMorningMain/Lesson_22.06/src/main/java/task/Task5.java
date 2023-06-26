package task;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 3, 6, 5, 9};
        System.out.println(getMain(arr));



    }


    /*
    -Напишите программу, которая находит сумму всех элементов в заданном массиве arr и выводит ее значение.
    -Напишите программу, которая находит среднее арифметическое значение элементов в заданном массиве arr и выводит его.
     */
    public static List<Integer> getMain(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(getSum(arr));
        list.add(getAvg(arr));
        return list;


    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (Integer num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }





}
