package homework_30_05;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    /*
    Напишите метод, который принимает массив int и возвращает количество уникальных элементов в этом массиве,
    используя Set для хранения уникальных значений.
    Уровень сложности: 5.
     */
    public static void main(String[] args) {
        int[] arr = {1, 4, 66, 32, 6, 4, 1, 22, 21, 78, 1, 66, 6};


        int set = getUniqueElem(arr);
        System.out.println("unique element: " + set);
    }

    public static int getUniqueElem(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}
