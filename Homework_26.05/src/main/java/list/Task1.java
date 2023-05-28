package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Task1 {
   static Random rm = new Random();
    public static void main(String[] args) {
// Напишите метод для нахождения суммы всех элементов в ArrayList<Integer>
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rm.nextInt(30));
        }
        int sum = listSum(list);
        System.out.println(sum);
    }

    public static int listSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
