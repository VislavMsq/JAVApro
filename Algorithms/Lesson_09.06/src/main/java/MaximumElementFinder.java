public class MaximumElementFinder {
    public static int findMaximum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 9, 7, 4, 2 };
        int max = findMaximum(arr);
        System.out.println("Maximum element: " + max);
    }
}
