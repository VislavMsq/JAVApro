package arrays;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        int[] arr = {23, 23, 13, 56, 15, 18, 10};
        int[] arr2 = {-1, 2, 3, -4, -5, 6, 7};
        Integer[] arr3 = {7, 6, 5, 4, 3, 2, 1};
        int[] arr4 = {7};
        Integer[] arr5 = {1, 1, 1, 1, 3, 6};

        String[] array = {"м", "а", "д", "а", "м"};

        String[] array2 = {"д", "у", "п", "а"};

        // 1.
//        System.out.println(isSort(arr5));

        // 2.
        System.out.println(isPalindrome(array));

        // 3.
        System.out.println(getSum(arr));

        // 4.
        System.out.println(isContains(arr, 12));

        // 5.
        System.out.println(getNegative(arr2));

        // 6.
        System.out.println(getSumElement(arr));

        // 7.
        System.out.println(secondMax(arr4));

        // 8.
        System.out.println(sumBasicNum(arr));

        // 9.
        System.out.println(getSumNumber(123));

        // 10.
        System.out.println(isDupNums(arr3));
    }

    // region 1.проверить сортированный ли массив, в любую из сторон

    public static boolean isSort(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        boolean sortedDown = true;
        boolean sortedUp = true;
        for (int i = 0; i < arr.length - 1; i++) {  // 1 -> 2 -> 3 <- 4
            if (arr[i] > arr[i + 1]) {
                sortedUp = false;
            }
            if (arr[i] <= arr[i + 1]) {
                sortedDown = false;
            }
        }
        if (sortedDown) {
            System.out.println("Sorted down");
        }
        if (sortedUp) {
            System.out.println("Sorted up");
        }
        return sortedUp || sortedDown;
    }

    // endregion
    // region   2.проверить массив на полидром
    public static boolean isPalindrome(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals(array[array.length - 1 - i])) {
                return false;
            }
            if (i >= array.length - 1 - i) {
                return true;
            }
        }
        return true;
    }

    // endregion
    // region   3.вывести суммы пар элементов
    public static List<Integer> getSum(int[] arr) {
        List<Integer> list = new ArrayList<>();
        if (arr.length <= 1) {
            for (Integer num : arr) {
                list.add(num);
            }
            return list;
        }
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length - 1; i += 2) {
                list.add(arr[i] + arr[i + 1]);
            }
        } else {
            for (int i = 0; i < arr.length - 2; i += 2) {
                list.add(arr[i] + arr[i + 1]);
            }
            list.add(arr[arr.length - 1]);
        }
        return list;
    }

    // endregion
    //    4.проверить массив на подстроку*
    // region    5.Проверить, содержит ли массив определенное значение:
    public static boolean isContains(int[] arr, int elem) {
        for (Integer num : arr) {
            if (num == elem) {
                return true;
            }
        }
        return false;
    }

    // endregion
    //  region  6.Найти количество отрицательных элементов в массиве.
    public static int getNegative(int[] arr2) {
        int count = 0;
        for (Integer num : arr2) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    // endregion
    // region   7.Найти сумму элементов на четных позициях (индексах) в массиве.
    public static int getSumElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - ((arr.length + 1) % 2); i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    // endregion
    // region   8.Найти второе наибольшее значение в массиве
    public static Integer secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        Integer secondMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                secondMax = max;
                max = j;
            }
        }
        if (secondMax.equals(Integer.MIN_VALUE)) {
            return null;
        }
        return secondMax;
    }

    // endregion
    //  region  9.Найти сумму всех простых чисел в массиве.
    public static int sumBasicNum(int[] arr) {
        int sum = 0;
        for (Integer num : arr) {
            if (isBasicNum(num)) {
                sum += num;
            }
        }
        return sum;
    }


    // endregion
    //  region  10.Проверить, является ли заданное число простым (простое число - число, которое делится только на 1 и на само себя).
    public static boolean isBasicNum(int num) {
        if (num % 2 == 0 && num != 2) {     // 4, 5, 7, 9, 13
            return false;
        } else if (num % 3 == 0 && num != 3) {
            return false;
        } else if (num % 5 == 0 && num != 5) {
            return false;
        } else if (num % 7 == 0 && num != 7) {
            return false;
        } else {
            return true;
        }
    }

    // endregion
    // region   11.Посчитать сумму цифр заданного числа.
    public static float getSumNumber(int num) {
        String str = Integer.toString(num);
        float sum = 0;
        for (Character ch : str.toCharArray()) {
            sum += Float.parseFloat(ch.toString());
        }
        return sum;
    }
    // endregion
    //    12.Посчитать сумму всех простых чисел в заданном диапазоне.

    //    13.Проверить, является ли заданная строка изограммой (все буквы в строке уникальные).
//    14.Найти наибольшую возрастающую последовательность в заданном массиве чисел.
    //  region  15.Проверить, есть ли в массиве повторяющиеся элементы.
    public static boolean isDupNum(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean isDupNums(Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));

        return set.size() != arr.length;
    }
    // endregion
//    16.Найти индекс первого вхождения заданного элемента в массиве.
//    17.Поменять местами минимальный и максимальный элементы в массиве.
//    18.Посчитать количество положительных и отрицательных элементов в массиве.
//    19.Найти среднее значение элементов в массиве.
//    20.Перевернуть массив задом наперед.


}
