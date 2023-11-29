import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Doe", 5000),
                new Employee("Alice", "Smith", 6000),
                new Employee("Bob", "Johnson", 4000),
                new Employee("Jane", "Williams", 5500),
                new Employee("Michael", "Brown", 7000)
        );
        // groupingBy
        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(employee -> {
                    if (employee.getSalary() < 5000) {
                        return "Low";
                    } else if (employee.getSalary() < 6000) {
                        return "Medium";
                    } else {
                        return "High";
                    }
                }));
        System.out.println(" groupingBy(): ");
        for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // groupingBy()
        List<String> list = Arrays.asList("apple", "banana", "orange", "cherry", "kiwi");
        Map<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

        // flatMap
        List<String> sentences = Arrays.asList("позволяет проваливатся по уровням и доставать информацию. " +
                "Компанует все полученные данные в одну строкуи");
        List<String> list1 = sentences.stream()
                .flatMap(el -> Arrays.stream(el.split("")))
                .map(String::toUpperCase)
                .toList();
        System.out.println(list1);

        // mapMulti()
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        Stream.of(list2)
                .flatMap(List::stream)
                .mapMulti((number, consumer) -> {
                    consumer.accept(number * number);
                    consumer.accept(number * number * number);
                }).forEach(System.out::println);

        // partitioningBy()
        List<String> list3 = Arrays.asList("apple", "banana", "orange", "cherry", "kiwi");
        Map<Boolean, List<String>> collect1 = list3.stream()
                .collect(Collectors.partitioningBy(el -> el.length() <= 5));
        System.out.println(collect1);

        //unordered()

    }

    @Getter
    @AllArgsConstructor
    @ToString
    static class Employee {
        private String firstName;
        private String lastName;
        private int salary;

    }
}
