package list;

import java.util.ArrayList;
import java.util.Random;

public class Task4 {
// Напишите метод для определения количества положительных чисел в ArrayList<Integer>.

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        int pos = getPos(arr);
        System.out.println("Positive number: " + pos);

    }

    public static int getPos(ArrayList<Integer> arr){
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr.add(random.nextInt(-50,50));
        }
        System.out.println(arr);
        int positive = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > 0 ){
                positive++;
                System.out.print(arr.get(i) + " ");

            }
        }
        return positive;
    }
}
