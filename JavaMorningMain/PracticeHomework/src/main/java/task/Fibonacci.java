package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }

    public static List<Integer> fibonacci(int limit){

        //  iterate = while(true)  i++

        //  .limit(limit) +1 +1 +1

        //  .forEach(System.out::println);


//        Stream.iterate(1, x -> x*10)

//        Stream.iterate(new Integer[]{0, 1}, arr -> new Integer[]{arr[1], arr[0] + arr[1]}) // [2,3] -> [3,5] { 1 , + }
//                .limit(limit)
//                .map((x) -> Arrays.toString(x))
//                .forEach(System.out::println);
//                .map(x -> x[0]) // arr >>> index 0
//                .toList();

        // [0, 1]
        // [1, 1] -> [1, 0+1]
        // [1, 2] -> [1, 1+1]
        // [2, 3] -> ...


        Integer[] arr = {0, 1}; // default

        int limit1 = 10;        // условие

        int i = 0; // счктчик операций .limit
        while (true){
            if (i == limit1){break;} else {i++;}
            int n = arr[0];
            System.out.println(n);

            System.out.println(Arrays.toString(arr));
            arr = new Integer[]{arr[1], arr[0]+arr[1]}; // перезапись массива для ряда фибоначи
        }


        return new ArrayList<>();

    }

}
