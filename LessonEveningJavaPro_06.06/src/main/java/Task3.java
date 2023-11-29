public class Task3 {
    // создать массив парных чисел(одна без пары) { 1,2,3,1,2,3,4 }
    //

    // найти решение этой задачи
    public static int getUnique(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                } else {
                    unique = arr[i];
                }
            }
        }
        return unique;
    }


    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 1, 2, 3};
        System.out.println(getUnique(arr));

    }
}
