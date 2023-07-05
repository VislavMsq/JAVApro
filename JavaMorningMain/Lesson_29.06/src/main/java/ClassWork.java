import java.lang.reflect.Array;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class ClassWork {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // filter
        numbers.stream()
                .filter(el -> el % 2 == 0)
                .toList();

        System.out.println(numbers);
        System.out.println("**************************************");

        List<String> names = Arrays.asList("Dima", "Roma", "Vadim", "Evgeny", "Vladislav");
        // map
        List<Integer> list = names.stream()
                .map(String::length)
                .toList();
        System.out.println(list);
        System.out.println("**************************************");

        List<Integer> numbers2 = Arrays.asList(1, 1, 1, 1, 2, 3, 4, 5, 6);
        // distinct
        List<Integer> list1 = numbers2.stream()
                .distinct()
                .toList();
        System.out.println(list1);
        System.out.println("**************************************");

        List<Integer> numbers3 = Arrays.asList(9, 4, 7, 1, 2, 16, 4, 5, 6);
        // sorted
        List<Integer> list2 = numbers3.stream()
                .sorted()
                .toList();
        System.out.println(list2);
        System.out.println("**************************************");

        List<Integer> numbers4 = Arrays.asList(9, 4, 7, 1, 2, 16, 4, 5, 6);
        // limit
        List<Integer> list3 = numbers4.stream()
                .limit(3)
                .toList();
        System.out.println(list3);
        System.out.println("**************************************");

        List<Integer> numbers5 = Arrays.asList(1, 1, 1, 1, 2, 3, 4, 5, 6);
        // skip
        List<Integer> list4 = numbers5.stream()
                .skip(3)
                .toList();
        System.out.println(list4);
        System.out.println("**************************************");

        List<String> names2 = Arrays.asList("Dima", "Roma", "Vadim", "Evgeny", "Vladislav");
        //forEach
        names2.stream()
                .forEach(System.out::println);
        System.out.println("**************************************");

        List<Integer> numbers6 = Arrays.asList(4, 6);
        //allMatch
        boolean b = numbers6.stream()
                .allMatch(el -> el % 2 == 0);
        System.out.println(b);
        System.out.println("**************************************");

        List<Integer> numbers7 = Arrays.asList(4, 6);
        // anyMatch
        boolean b1 = numbers7.stream()
                .anyMatch(el -> el % 2 == 0);
        System.out.println(b1);
        System.out.println("**************************************");

        List<Integer> numbersMM = Arrays.asList(1, 1, 9, 4, 5, 6);
        //noneMatch()
        boolean b11 = numbersMM.stream()
                .noneMatch(n -> n < 0);
        System.out.println(b11);
        System.out.println("**************************************");


        List<Integer> numbers9 = Arrays.asList(1, 1, 9, 4, 5, 6);
        // findFirst
        Optional<Integer> optional = numbers9.stream()
                .findFirst();
        System.out.println(optional.orElse(0));
        System.out.println("--------------------------------------");

        List<Integer> numbersQ = Arrays.asList(1, 1, 9, 4, 5, 6);
        // reduce()
        Optional<Integer> opt = numbersQ.stream()
//                .reduce(Integer::sum);  иная запись
                .reduce((el1, el2) -> el1 + el2);
        System.out.println(opt);
        System.out.println("**************************************");

        List<Integer> numbersW = Arrays.asList(1, 1, 9, 4, 5, 6);
        //collect
        Set<Integer> set = numbersW.stream()
                .collect(Collectors.toSet());
        System.out.println(set);
        System.out.println("**************************************");

        List<List<Integer>> groups = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8));
        // flatMap()
        List<Integer> list5 = groups.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(list5);
        System.out.println("**************************************");

    }
}
