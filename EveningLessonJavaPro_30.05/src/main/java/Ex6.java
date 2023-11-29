import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {

        System.out.println(getAvg(randomList()));
    }

    public static void maxList(List<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                System.out.println(max);
            }
        }
    }

    public static void SecondMaxList(List<Integer> list) {
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max2 = max;
                max = list.get(i);
            } else if (list.get(i) > max2 && max2 != max) {
                max2 = list.get(i);
            }
        }
        System.out.println(max2);
    }

    public static void sortList(List<Integer> list, int k) {
        Collections.sort(list);     // сортировка массива
        int sum = 0;
        int start = 0;
        int finish = list.size() - 1;
        while (start != finish) {
            sum = list.get(start) + list.get(finish);
            if (sum > k) {
                finish--;
            } else if (sum < k) {
                start++;
            } else if (sum == k) {
                System.out.println("We find elements: ");
            }else {
                break;
            }

        }
    }
    public static int avg(List<Integer> list){
        int avg = 0;
        for (int i = 0; i < list.size(); i++) {
            avg += list.get(i);
            avg = avg / list.size();
        }
        return avg;
    }
    //найти среднее арифметическое четные и нечетных, потом четные разделить на нечетные
    public static double getAvg(List<Double> list){
        double even = 0;
        double odd = 0;
        double countEven = 0;
        double countOdd = 0;

        for (int i = 0; i < list.size(); i++) {
           if (list.get(i) % 2 == 0){
               even += list.get(i);
               countEven++;
            } else {
               odd += list.get(i);
               countOdd++;
           }
        }
        even = even / list.size();
        odd = odd / list.size();
        return  even / odd;
    }
    public static ArrayList<Double> randomList(){
        ArrayList<Double> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextDouble(20));
        }
        return list;
    }
}