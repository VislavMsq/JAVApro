import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 1, 2, 8, 9, 44, 66};
        int temp = 0;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = arr.length - 2; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            boolean isChanged = false;
            for (int j = arr.length - 2; j > arr.length - 2 - i; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isChanged = true;
                }
                if (!isChanged){
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }
 */