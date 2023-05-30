package list;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    // Напишите метод для поиска наибольшего числа в ArrayList<Integer>.
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        int larges = largestNumber(list);
        System.out.println("Max num in ArrayList: " + larges);

    }
    public static int largestNumber(ArrayList<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        for (int i = 0; i < list.size(); i++) {
        }
        System.out.println(list);
        int listMax = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > listMax){
                listMax = list.get(i);
            }
        }
        return listMax;
    }
}
