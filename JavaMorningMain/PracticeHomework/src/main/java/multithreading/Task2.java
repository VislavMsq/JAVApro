package multithreading;

import lombok.AllArgsConstructor;

import java.util.Arrays;

public class Task2 {

    public static int[] mergeAndSort(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0;
        int j = 0; // -> 1,
        int k = 0; // -> 1,

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }


    public static void main(String[] args) throws InterruptedException {
        int[] arr = {2, 6, 5, 2, 8, 6, 1, 9, 2, 10, 20, 14, 25, 2, 3, 8, 3};
        EBoySort eBoySort1 = new EBoySort(0, arr.length / 2, arr);
        EBoySort eBoySort2 = new EBoySort(arr.length / 2, arr.length, arr);

        eBoySort1.start();
        eBoySort2.start();

        eBoySort1.join();
        eBoySort2.join();

        System.out.println(Arrays.toString(Task2.mergeAndSort(eBoySort1.getSorted(), eBoySort2.getSorted())));

    }
}

@AllArgsConstructor
class EBoySort extends Thread {
    int firstIndex;
    int endIndex;
    int[] arr;

    @Override
    public void run() {
        int temp;
        for (int i = firstIndex; i < endIndex; i++) {
            for (int j = i; j < endIndex; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public int[] getSorted() {

        // [0,0,0,0,0,0,0,0]
        // [1,2,3,4,5,6,7,8,9,10, 15, 17, 20, 14...]

        int[] arr = new int[endIndex - firstIndex];
        int flag = 0;
        for (int i = firstIndex; i < endIndex; i++) {
            // arr[flag(1)] -> arr[flag(2)]
            arr[flag] = this.arr[i];
            flag++;
        }
        return arr;
    }
}
