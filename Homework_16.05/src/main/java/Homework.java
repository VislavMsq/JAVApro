import java.util.Arrays;
import java.util.Random;

/**
 * Homework JavaPro
 * Mosiuk Vladislav
 * date: 16.05
 * Я плохо решаю алгоритмические задачи, у меня чуть не хватает ума для них пока,
 * технологии понимаю, а как решить иногда сложности
 * буду комментировать код, сам для себя
 */

public class Homework {
    public static void main(String[] args) {
/*
    1.Найти сумму всех элементов в массиве.
    2.Найти наибольшее значение в массиве.
    3.Посчитать количество четных чисел в массиве.
    Уровень сложности 2 из 10:
 */
        // 1.
//        Random random = new Random();
//        int arr[] = new int[12];
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(20);
//            System.out.println("basic arr " + arr[i] + " ");
//            sum += arr[i];
//
//        }
//        System.out.println("sum arrays: " + sum);

        // 2.
//        Random random1 = new Random();      // метод рандом
//        int arr1[] = new int[10];           // инициализировали массив и определили его длинну
//        int maxNum = 0;                     // переменная для максимального числа
//
//        for (int i = 0; i < arr1.length; i++) {              // заполняем массив
//            arr1[i] = random1.nextInt(100);            // присваеваем числа в массив в диапозоне до 100
//            System.out.println("Basic arrays: " + arr1[i]);  // принтим для читаемости
//            if (maxNum < arr1[i]) {     // делаем проверку, если наш maxNum меньше числа из массива
//                maxNum = arr1[i];       // присваеваем значение максимального числа и повторяем цикл пока не закончимтся массив
//            }
//            System.out.println("Max num: " + maxNum);
//        }
/*
Есть массив , в нем рандомное кл-во чисел и я не знаю сколько там четных.
    1.Мне нужно перебрать массив через for - я определю пласт чисел
    2.потом я выполню проверку на четность через if( arr[i] % 2 == 0)
    3.создам переменную и запишу все четные числа в нее
    4.посчитаю все четные числа
 */

        // 3.
//        Random random2 = new Random();
//        int arr2[] = new int[12];
//        int even = 0;
//
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = random2.nextInt(30);
//            if (arr2[i] % 2 == 0) {
//                even++;
//                System.out.println("even numbers: " + arr2[i]);
//            }
//        }
//        System.out.println("All even numbers: " + even);
/*
1.Проверить, содержит ли массив заданное значение.
2.Отсортировать массив по возрастанию.
3.Найти индекс первого вхождения заданного значения в массиве.
 */
        // 1.
//        Random random3 = new Random();
//        int arr3[] = new int[10];
//        boolean containsValue = false;
//
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = random3.nextInt(100);
//            if (arr3[i] == 69) {
//                containsValue = true;
//                break;
//            }
//        }
//        if (containsValue) {
//            System.out.println("There is no such number in the array");
//        } else {
//            System.out.println("There is a number in the array");
//        }

        // 2.
        Random random = new Random();
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}










