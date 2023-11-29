import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[]arrSort =  mergeSort(arr);
        System.out.println(Arrays.toString(arrSort));
    }

    private static int[] mergeSort(int[] arr) {
        int len = arr.length;
        // базовый случай
        if (len == 1) {
            return arr;
        }
        int mid = len / 2;
        int[] first = new int[mid];         // первый подмассив = 3 элемента
        int[] second = new int[len - mid];  // второй подмассив = 4 элемента
        // заполняем подмассивы
        for (int i = 0; i < mid; i++) {
            first[i] = arr[i];
        }
        for (int i = 0; i < len - mid; i++) {
            second[i] = arr[i + mid];
        }
//        for (int i = mid; i < len; i++) {
//            second[i - mid] = arr[i];
//        }
        return merge(mergeSort(first),mergeSort(second));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < len1) {
            arr[k++] = arr1[i++];
        }
        while (j < len2) {
            arr[k++] = arr2[j++];
        }
        return arr;
    }
}

