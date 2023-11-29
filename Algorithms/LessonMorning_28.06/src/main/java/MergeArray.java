public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 9};
        int[] arr2 = {4, 7};
        System.out.println(findNumber(arr1, arr2, 3));
    }

    private static int findNumber(int[] arr1, int[] arr2, int k) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        // проверка больше ли число 0 и больше ли оно суммы массива
        if (k < 0 || k > len1 + len2) {
            System.out.println("Error");
            return -1;
        }
        int i = 0, j = 0;   //  указывают на 0 индексы
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                if (i + j == k) {
                    // в результирующий массив нужно заносить arr[i]
                    return arr1[i];
                } else {
                    i++;
                }
            } else {
                if (i + j == k) {
                    return arr2[j];
                }
                if (i + j == k) {
                    return arr2[j];
                } else {
                    j++;
                }
            }
        }
        while (j < len1) {
            if (i + j == k) {
                return arr1[i];
            }
            while (j < len2) {
                if (i + j == k) {
                    return arr2[j];
                }
            }
        }
        return -1;
    }
}