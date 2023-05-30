package list;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
//  Напишите метод для удаления всех четных чисел из ArrayList<Integer>.
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        removeNum(list);
        System.out.println("new Arrays " + list);

    }

    public static void removeNum(ArrayList<Integer> list){
        Random rm = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rm.nextInt(30));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;            // когда из массива удаляется элемент, индекс препрыгует на следующий, а на наш прошлый
                                // смещается слеюущий элемент и i-- позволяет нам если элемент удаляется сметить иттерацию на -1
            }
        }
    }
}
