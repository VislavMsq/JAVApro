package streamAPI;

import streamAPI.OddEven;

import java.util.List;

public class OddEvenTask {
    public OddEven oddEvenPartition(List<Integer> num) {
        List<Integer> evenNums = num.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        List<Integer> oddNums = num.stream()
                .filter(x -> x % 2 != 0)
                .toList();

        return new OddEven(oddNums, evenNums);
    }
}
