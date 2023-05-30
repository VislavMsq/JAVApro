package list;

import java.util.ArrayList;
import java.util.Random;

public class Task8 {
    // Напишите метод, который объединяет два ArrayList<Integer> в один, удаляя дубликаты элементов.
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> sumArr = new ArrayList<>();

        getSumArr(list1,list2,sumArr);


    }

    public static void getSumArr(ArrayList<Integer> list1, ArrayList<Integer> list2){
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(20));
        }
        System.out.println(list1);

        for (int i = 0; i < 10; i++) {
            list2.add(random.nextInt(20));
        }
        System.out.println(list2);

        ArrayList<Integer> sumArr = getSumArr(list1,list2);

        System.out.println(sumArr);

    }
}