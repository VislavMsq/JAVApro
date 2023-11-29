public class Random {
    public static final int ARRAY_SIZE = 100;

    public static void main(String[] args) {
        // (int)((B -A) * Math.random() + A + 0.5
        int[] arr = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = (int) (200 * Math.random() - 100);
        }
        long temp = System.currentTimeMillis();
//        int[] arrSort = mergeSort(arr);
    }
}

