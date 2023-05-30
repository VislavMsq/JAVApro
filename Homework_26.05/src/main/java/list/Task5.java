package list;

import java.util.ArrayList;
import java.util.Random;

public class Task5 {
    // Напишите метод, который проверяет, содержит ли ArrayList<Integer> заданное число.
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        boolean num = getNum(list, 9);
        System.out.println(num);
    }

    public static boolean getNum(ArrayList<Integer> list, int n) {
        Random rm = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rm.nextInt(50));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                return true;
            }
        }
        return false;
    }
}
