import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hw {
    public static void main(String[] args) {

        // 1.
        countUniqueEnumNum("int.txt");

        // 2.
        groupByString("str.txt");

        // 3.
        System.out.println(filterMulti("int.txt"));

        // 4.
        System.out.println(toPrimeList("intPrime.txt"));

        // 5.
        System.out.println(uniqueSymbol("str.txt"));
    }

    // 1. Задача 1: Подсчет количества уникальных четных и нечетных чисел
    public static void countUniqueEnumNum(String filename) {
        List<Integer> list = FileManager.readIntAndCreateteList(filename);
        long l = list.stream()
                .filter(el -> el % 2 == 0)
                .distinct()
                .count();
        System.out.println(l);
    }

    // 2. Задача 2: Группировка строк по первым буквам и вывод первых двух слов из каждой группы
    public static void groupByString(String filename) {
        List<String> list = FileManager.readToWordList(filename);
        Map<Character, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(el -> el.charAt(0)));
        System.out.println(collect);

        collect.forEach((key, value) -> {
            System.out.println(key + ": ");

            value.stream()
                    .limit(2)
                    .forEach(el -> System.out.println("\t" + el));
            System.out.println();
        });
    }

    // Задача 3: Фильтрация и умножение числа на 2
    public static List<Integer> filterMulti(String filename) {
        List<Integer> list = FileManager.readIntAndCreateteList(filename);
        return list.stream()
                .filter(el -> el % 2 == 0)
                .map(el -> el * 2)
                .toList();
    }

    // Задача 4: Разделение чисел на простые и составные
    public static Map<Boolean, List<Integer>> toPrimeList(String filename) {
        List<Integer> list = FileManager.readIntAndCreateteList(filename);
        return list.stream()
                .collect(Collectors.groupingBy(Hw::isPrime));
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Задача 5: Получение уникальных символов из списка строк

    // ["aaa", "bbb"]
    // [[a,a,a], [b,b,b]]
    // a,a,a,b,b,b

    public static List<String> uniqueSymbol(String filename) {
        List<String> list = FileManager.readToWordList(filename);
        return list.stream()
                .map(el -> List.of(el.split("")))
                .flatMap(Collection::stream)
                .distinct()
                .toList();
    }
}
