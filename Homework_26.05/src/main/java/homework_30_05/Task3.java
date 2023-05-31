package homework_30_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task3 {
    /*
    Напишите метод, который принимает два массива int и возвращает Set,
    содержащий элементы, которые присутствуют и в первом, и во втором массивах.
    Уровень сложности: 5.
     */
    public static void main(String[] args) {
        int[] arr = {1, 4, 66, 32, 6, 4, 1, 22, 21, 78};
        int[] arr2 = {2, 4, 65, 32, 9, 4, 2, 23, 21, 79};

        Set<Integer> elem = findElem(arr,arr2);
        System.out.println(elem);
    }

    public static Set<Integer> findElem(int[] arr, int[] arr2) {
        ArrayList<Integer> arrayList = new ArrayList<>();


        for(int num : arr){
            arrayList.add(num);
        }
        for (int num : arr2){
            arrayList.add(num);
        }
        Set<Integer> set = new HashSet<>(arrayList);
        return set;
    }
}
