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
        //Задача 7. Найти индекс первого вхождения заданного значения в массиве.
        //Уровень сложности 3 из 10:
//        int[] array = {2, 4, 6, 8, 25, 44, 69, 13};
//        int target = 44;
//        int index = findeTagetMethode(array, target);
//        System.out.println("Индекс первого вхождения значения " + target + " в массиве " + index);

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
5.Проверить, содержит ли массив заданное значение.
6.Отсортировать массив по возрастанию.
7.Найти индекс первого вхождения заданного значения в массиве.
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
//        Random random = new Random();
//        int arr[] = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100);
//        }
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
//    }
//
//    public static int findeTagetMethode(int[]array ,int target ){
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == target)
//                return i;
//        }
//        return -1;
//    }
/*
8.Найти среднее значение всех элементов в массиве.
9.Поменять порядок элементов массива на обратный.
10.Проверить, является ли массив палиндромом (элементы читаются одинаково с начала и с конца).
11.Уровень сложности 4 из 10:
 */
        // 8.
//        Random rand = new Random();
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rand.nextInt(100);
//            System.out.println("Начальный массив");
//            System.out.println(Arrays.toString(array));
//        }
//        int sum = 0;    // сумма элементов
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//            int averageValue = sum / array.length;
//
//            System.out.println("Среднее значения массива " + averageValue);
//        }
//    }

        // 9.
//        int[] array = {1, 3, 6, 9, 23, 5, 6, 7, 3, 12, 65, 12};
//        int[] result = new int[array.length];
//        System.out.println(Arrays.toString(array));
//
//        for (int i = array.length - 1, j = 0; i >= 0; i--, j++){
//            result[j] = array[i];
//        }
//        System.out.println(Arrays.toString(result));

//        int[] arr = {1, 3, 5, 7, 7, 5, 3, 1};
//        boolean palindome = true;
//
//        for (int i = 0; i < arr.length / 2; i++) {
//            if (arr[i] != arr[arr.length - 1 - i]){
//                palindome = false;
//                break;
//            }
//        }
//        if (palindome){
//            System.out.println("Массив палиндром");
//        }else {
//            System.out.println("Массив не палиндром");
//        }
    }
}