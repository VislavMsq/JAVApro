import java.util.Arrays;

public class HW {
    public class EX1 {

        // merge (arr1, arr2)
/*
Task 1. Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
Массив 1 - 100 112 256 349 770
Массив 2 - 72 86 113 119 265 445 892
к = 7
Вывод : 256
Окончательный отсортированный массив -
72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
7-й элемент этого массива равен 256.
Массивы приведены для примера. Алгоритм должен работать и на других массивах.

Task 2. Реализовать рекурсивный алгоритм бинарного поиска. Используйте стратегию "разделяй и властвуй".
 */

        public static void main(String[] args) {
            int[] arr = {100, 112, 256, 349, 770};
            int[] arr2 = {72, 86, 113, 119, 265, 445, 892};

            System.out.println(getItemByIndex(merge(arr, arr2), 7));
        }

        public static int getItemByIndex(int[] arr, int index) {

            return arr[index];
        }

        public static int[] merge(int[] arr1, int[] arr2) {
            int[] mergedArr = new int[arr1.length + arr2.length];

            int cursor1 = 0;
            int cursor2 = 0;

            int cursorMain = 0;

            // счетчик двойной длинны


            for (int i = 0; i < mergedArr.length; i++) {
                if (arr1[cursor1] <= arr2[cursor2]) {
                    mergedArr[i] = arr1[cursor1];
                    cursor1++;
                    if (cursor1 == arr1.length) {
                        cursorMain = i + 1;
                        break;
                    }

                } else if (arr1[cursor1] > arr2[cursor2]) {
                    mergedArr[i] = arr2[cursor2];
                    cursor2++;
                    if (cursor2 == arr2.length) {
                        cursorMain = i + 1; // я добавив "+ 1" шо б "770" не перезаписувалась на "892"
                        break;
                    }
                }
            }

            // {1,2,3}
            // {1,2,3,4,5,6}

            // cursor2 < arr2.lenпth >>> cursor2++;

            // else >>> break

            while (cursor1 < arr1.length) {
                mergedArr[cursorMain++] = arr1[cursor1++];
            }
            while (cursor2 < arr2.length) {
                mergedArr[cursorMain++] = arr2[cursor2++];
            }

            System.out.println(Arrays.toString(mergedArr));
            return mergedArr;


//            System.out.println(mergedArr);

            // i++

            // arr1[cursor1] > arr2[cursor2]
            // arr1[cursor1] >>> mergedArr[i]
            // cursor1

            //                             |
            //{100, 112, 256, 349, 770 };
            //                               |
            // {72 ,86 ,113 ,119 ,265 ,445 ,892, ...};
            //


        }
    }
}
