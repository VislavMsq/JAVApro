public class Main {
    public static void main(String[] args) {
        int[][] arr = {{7, 8, 9}, {1, 1, 1}, {1, 1, 1}};
        findArr(arr);

    }

    public static void findArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean allOnes = checkAllOnes(arr[i]);
            if (allOnes) {
                System.out.println("Index of array is : " + i);
                return;
            }
        }
        System.out.println("There is no such array");
    }

    private static boolean checkAllOnes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                return false;
            }
        }
        return true;
    }
}
