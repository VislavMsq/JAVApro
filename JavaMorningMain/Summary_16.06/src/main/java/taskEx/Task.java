package taskEx;

public class Task {
    // 1. Проверить что числа массива находятся в неубывающем порядке.

    /*
    1. создать массив целых чисел
    2. пройтись циклом
    3. в условии проверить порядок элементов
    4. если след. элем. больше предыдущего, то массив в неубывающем порядке
        пример: 1 1 2 -> true
        пример: 1 2 3 -> true
        пример: если элем. 1 или массив пустой -> true
     */
    public static void main(String[] args) {
//        int[] arr = {2, 5, 8, 2, 5, 12, 45};
//        int[] arr = {1, 2, -3};
//        int[] arr = {1, 2, 3};
          int[] arr = {1};

        System.out.println(extracted(arr));
    }

    private static boolean extracted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
