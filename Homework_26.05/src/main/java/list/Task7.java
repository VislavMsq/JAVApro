package list;

import java.util.ArrayList;
import java.util.Random;

public class Task7 {
    // Напишите метод для нахождения второго наименьшего числа в ArrayList<Integer>.
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        getMaxSecond(list);


    }

    public static void getMaxSecond(ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);

        int maxFirst = list.get(0);
        int maxSecond = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxFirst) {
                maxSecond = maxFirst;
                maxFirst = list.get(i);
            } else if (list.get(i) > maxSecond) {
                maxSecond = list.get(i);
            }

        }
        System.out.println("maxFirst: " + maxFirst);
        System.out.println("maxSecond: " + maxSecond);
    }
}
