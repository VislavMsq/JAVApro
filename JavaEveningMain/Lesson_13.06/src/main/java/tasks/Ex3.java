package tasks;

import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {
        //Найти сумму всех элементов в Set<Integer>, которые являются четными числами.
        Set<Integer> set = Set.of(5, 10, 20, 4, 12);
        System.out.println(getSum(set));
    }

    public static int getSum(Set<Integer> set) {
        int sum = 0;
        for (Integer elem : set) {
            if (elem % 2 == 0) {
                sum += elem;
            }
        }
        return sum;
    }
}
