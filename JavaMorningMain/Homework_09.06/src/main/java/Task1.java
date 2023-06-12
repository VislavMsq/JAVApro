import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /*
Создайте массив целых чисел с некоторыми значениями и инициализируйте его. Пример:

int[] array = {5, 10, 3, 8, 2};
Создайте коллекцию (например, ArrayList или LinkedList) целых чисел и добавьте в нее несколько значений. Пример:

List<Integer> list = new ArrayList<>(); list.add(5); list.add(10); list.add(3); list.add(8); list.add(2);
Используя цикл for, переберите элементы массива и выведите каждый элемент на экран.
     */
    public static void main(String[] args) {
        //1.
        int[] array = {5, 10, 3, 8, 2};
        List<Integer> result = getList(array);
        System.out.println("Result -> " + result);
        int sumList = getSum(array);
        System.out.println("Sum list -> " + sumList);

        //2.
        int sum = getSum(array);
        System.out.println("Sum - > " + sum);

        //3.
        List<Integer> sumlist = getListSum(array);
        int sumArrList = calcSum(sumlist);
        System.out.println("Sum ArrayList -> " + sumArrList);

        //4.
        List<Integer> sumlistList = getMaxAndMinList(array);
        System.out.println("Max and min list -> " + sumlistList);

        //5.
        int count = getCount(array);
        System.out.println("Count -> " + count);

        //6.
        List<Integer> listCount = getCountList(array);
        System.out.println("List count -> " + listCount);

        //7.
        double avg = getAvg(array);
        System.out.println("Average array -> " + avg);

        //8.
        List<Double> avgList = getAvgList(array);
        System.out.println("Average ArrayList -> " + avgList);


    }

    // Используя цикл for-each, переберите элементы коллекции и выведите каждый элемент на экран.
    public static List<Integer> getList(int[] array) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(8);
        list.add(2);

        for (Integer num : list) {
            System.out.println("All elements -> " + num);
        }
        return list;
    }

    //Найдите сумму всех элементов в массиве и выведите ее на экран.
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //Найдите сумму всех элементов в коллекции и выведите ее на экран.
    public static List<Integer> getListSum(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    public static int calcSum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    // Найдите наименьшее и наибольшее значение в массиве и выведите их на экран.
    public static void getMinAndMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max -> " + max);
        System.out.println("min -> " + min);
    }

    // Найдите наименьшее и наибольшее значение в коллекции и выведите их на экран.
    public static List<Integer> getMaxAndMinList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        list.add(max);
        list.add(min);
        return list;
    }

    // Посчитайте количество элементов в массиве и выведите его на экран.
    public static int getCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arrays -> " + arr[i]);
            count++;
        }

        return count;
    }

    // Посчитайте количество элементов в коллекции и выведите его на экран.
    public static List<Integer> getCountList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            list.add(count++);
            System.out.println("List count -> " + list.get(i));
        }
        return list;
    }

    // Подсчитайте среднее арифметическое всех элементов в массиве и выведите его на экран.
    public static double getAvg(int[] arr) {
        int sum = 0;
        double avg = 0;
        for (int num : arr) {
            sum += num;
            avg =  (double) sum / arr.length;
        }
        return avg;
    }

    // Подсчитайте среднее арифметическое всех элементов в коллекции и выведите его на экран.
    public static List<Double> getAvgList(int[] arr) {
        List<Double> listAvg = new ArrayList<>();
        int sum = 0;
        double avg = 0;
        for (int num : arr){
            sum += num;
            avg = (double) sum / arr.length;
        }
        listAvg.add(avg);
        return listAvg;
    }
}
