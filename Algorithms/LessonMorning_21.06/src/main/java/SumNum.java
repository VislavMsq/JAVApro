public class SumNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(getSum(arr, arr.length - 1));
    }

    private static int getSum(int[] arr, int i) {
        if (i == 0) {         // азовый случай, проверка
            return arr[0];
        }
        return getSum(arr, i - 1) + arr[i];
    }
}
