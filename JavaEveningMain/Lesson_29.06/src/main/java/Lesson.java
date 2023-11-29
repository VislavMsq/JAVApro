import java.util.List;

public class Lesson {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> numbers2 = List.of(1, 20, 3, 4, 1, 5, 6, 7, 8);
        // filter() - берем все цифры и фильтруем
        List<Integer> list = numbers.stream()
                .filter(el -> el % 2 == 0)
                .toList();
        System.out.println(list);
        System.out.println("****************************************");

        // map() - можем передать один тип данных, а вернуть другой
        List<Integer> numbers3 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        numbers2.stream()
                .map(el -> el * 10)
                .forEach(System.out::println);
        System.out.println(numbers3);
        System.out.println("****************************************");

        //distinct()
        List<Integer> numbers4 = List.of(1, 2, 2, 3, 4, 5, 6, 6, 7, 8);
        numbers4.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("****************************************");

        // limit()
        List<Integer> numbers5 = List.of(1, 2, 2, 3, 4, 5, 6, 6, 7, 8);
        numbers5.stream()
                .sorted()
                .distinct()
                .filter(el -> el % 2 == 0)
                .limit(3)
                .forEach(System.out::println);

        // skip()
        List<Integer> numbers6 = List.of(1, 2, 2, 3, 4, 5, 6, 6, 7, 8);
        List<Integer> list1 = numbers6.stream()
                .skip(5)
                .toList();
        System.out.println(list1);

        // allMatch() - возвращает
        List<Integer> numbers7 = List.of(1, 2, 2, 3, 4, 5, 6, 6, 7, 8);
        boolean b = numbers7.stream()
                .allMatch(el -> el > 2);
        System.out.println(b);

    }
}
