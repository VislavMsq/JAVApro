package list;

import java.util.ArrayList;
import java.util.Random;

public class Task5 {
    // Напишите метод, который проверяет, содержит ли ArrayList<Integer> заданное число.
    public static void main(String[] args) {
        Random rm = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rm.nextInt(50));
        }
        System.out.println(list);

        boolean num = getNum(list, 9);
        System.out.println(num);
    }

    public static boolean getNum(ArrayList<Integer> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                return true;
            }
        }
        return false;
    }
}
