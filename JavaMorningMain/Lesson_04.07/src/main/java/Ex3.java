import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 45, 7, 89, 7, 10);

        // count
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("-----------------------------------");

        // max
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        max.ifPresent(el -> System.out.println("Max: " + max));
        System.out.println("-----------------------------------");

        // findAny
        Optional<Integer> any = list.stream().findAny();
        any.ifPresent(el -> System.out.println("First: " + any));
        System.out.println("-----------------------------------");

        //forEach
        System.out.println("ForEach: ");
        list.forEach(System.out::println);
        System.out.println("-----------------------------------");

        //distinct
        List<Integer> dis = list.stream().distinct().toList();
        System.out.println("Distinct: " + dis);
        System.out.println("-----------------------------------");

        //peek
        List<Integer> peek = list.stream().peek(System.out::println).toList();
        System.out.println("Peek: " + peek);
        System.out.println("-----------------------------------");

        // toArray
        Integer[] arr = list.toArray(Integer[]::new);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("-----------------------------------");

        // reduce
        Optional<Integer> sum = list.stream().reduce(Integer::sum);
        sum.ifPresent(el -> System.out.println("Sum: " + sum));
        System.out.println("-----------------------------------");

        //mapToInt
        int intSum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("MapToInt: " + intSum);
        System.out.println("-----------------------------------");
    }
}
