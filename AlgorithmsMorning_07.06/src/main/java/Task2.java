import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 10, 0, 8, 7, 3, 5, 4};

        getArr(arr, 10);


    }

    public static void getArr(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("1 -> " + arr[i] + " " + "2 -> " + arr[j]);
                }
            }
        }
    }
}
