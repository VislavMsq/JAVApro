package homework_30_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
/*
Удаление дубликатов: Напишите метод, который принимает массив int и возвращает ArrayList,
содержащий все уникальные элементы исходного массива, сохраняя их порядок. Уровень сложности: 4.
 */

        int[] arr = {1, 4, 66, 32, 6, 4, 1, 22, 21, 78};
        ArrayList<Integer> list = getArrayList(arr);
        System.out.println(list);
    }
    public static ArrayList<Integer> getArrayList(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        return new ArrayList<> (set);
    }
}
