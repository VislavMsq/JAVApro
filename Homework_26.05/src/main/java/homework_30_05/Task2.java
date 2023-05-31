package homework_30_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
/*
Обратный порядок: Напишите метод, который принимает массив int и возвращает ArrayList,
содержащий элементы исходного массива в обратном порядке. Уровень сложности: 4.
 */
        int[] arr = {1, 4, 66, 32, 6, 4, 1, 22, 21, 78};
        ArrayList<Integer> getList = list(arr);
        System.out.println(getList);
    }

    public static ArrayList<Integer> list(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
                arrayList.add(arr[i]);
            }

        return arrayList;
    }
}
