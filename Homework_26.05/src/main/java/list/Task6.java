package list;

import java.util.ArrayList;
import java.util.Random;

public class Task6 {
//  Напишите метод для сортировки ArrayList<Integer> в порядке возрастания.

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(random.nextInt(30));
        }
        System.out.println(list);


        getSort(list);
        System.out.print(list + " ");
    }

    public static void getSort(ArrayList<Integer> list){
     int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }

        }
    }
}
