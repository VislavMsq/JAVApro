package arrays;

public class Task7 {
    // Напишите программу, которая находит наиболее часто встречающийся элемент в заданном массиве.
    public static void main(String[] args) {
        int[] array = {1, 3, 88, 3, 3, 3, 1, 5, 5, 1};
        int maxCount = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            int repeated = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repeated++;
                }
                if (repeated > maxCount) {
                    maxCount = repeated;
                    num = array[i];
                }
            }
        }
        System.out.println(num);
    }
}