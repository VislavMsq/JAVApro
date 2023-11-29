public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearchRec(arr, 9));
    }

    public static int binarySearchRec(int[] arr, int target) {
        return binarySearchRec(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchRec(int[] arr, int target, int left, int right) {
        // исло не найдено
        if (left > right){
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRec(arr, target, mid + 1, right);
        } else {
            return binarySearchRec(arr, target, left, mid - 1);
        }
    }
}
