package example1;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    // Напишите метод на Java, который принимает на вход массив целых чисел и возвращает новый массив,
// содержащий только уникальные значения из исходного массива. Дубликаты должны быть удалены.
    public static void main(String[] args) {
        int[] arr = {4, 9, 12, 19, 4, 3, 5, 12, 3, 1};




        System.out.println(list(arr));
//        for (int num : uniqueNum)
//            System.out.print(num + " ");
    }

    public static Set<Integer> list(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

//        int[] uniqueNum = new int[set.size()];
//        int index = 0;
//        for (int num : set) {
//            uniqueNum[index++] = num;
//        }
//        return uniqueNum;
        return set;
    }
}
