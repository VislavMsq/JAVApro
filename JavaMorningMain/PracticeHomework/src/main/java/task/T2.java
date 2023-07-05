package task;

import java.util.Arrays;

public class T2 {
    //    7.Найти среднее значение элементов в массиве.
    public static void main(String[] args) {
        createEatArray(arr -> {
            int avg = 0;
            for (Integer elem : arr) {
                avg += elem;
            }
            avg = avg / arr.length;
            System.out.println(avg);
        });
    }

    public static void createEatArray(We we) {
        int[] eat = {2, 8, 4, 6, 12, 9};
        we.bogdanKushaet(eat);
    }
}

@FunctionalInterface
interface We {
    void bogdanKushaet(int[] eat);
}
