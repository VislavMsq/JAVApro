package codeWars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TaskA {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{2, 4, 5, 2};
        System.out.println(ArrayPrinter3.printArray(array));
    }
}

class ArrayPrinter {
    public static String printArray(Object[] array) {
        return String.join(",", (String[]) array);
    }
}

class ArrayPrinter2 {
    public static String printArray(Object[] array) {
        String[] stringArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            stringArray[i] = String.valueOf(array[i]);
        }
        return String.join(",", stringArray);
    }
}

class ArrayPrinter3 {
    public static String printArray(Object[] array) {
        return Arrays.stream(array)
                .map(String::valueOf)
                .collect(Collectors.joining(","));

    }
}