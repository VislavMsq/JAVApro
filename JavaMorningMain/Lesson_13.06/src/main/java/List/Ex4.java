package List;

import java.util.HashSet;
import java.util.Set;

public class Ex4 {
    //Найти сумму всех элементов в Set<Integer>, которые являются четными числами.
    /*
    1.перебрать циклом
    2.в проверке узнать четность чисел
    3.найти сумму
    4.создам переменную для суммы
     */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(1);
        set.add(9);
        set.add(11);
        set.add(8);
        System.out.println(getSum(set));
    }

    public static int getSum(Set<Integer> set) {
        int sum = 0;
        for(Integer num : set){
            if (num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }
}
