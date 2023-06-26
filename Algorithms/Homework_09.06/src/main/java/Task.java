public class Task {
    public static void main(String[] args) {

    }

    public static int[] arrayMerged(int[] arr, int[] arr2) {

        int[] arrayMerged = new int[arr.length + arr2.length];
        System.arraycopy(arr,0,arrayMerged,0,arr2.length);


        return null;
    }
}
