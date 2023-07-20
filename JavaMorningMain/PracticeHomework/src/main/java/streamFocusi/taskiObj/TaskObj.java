package streamFocusi.taskiObj;

import java.util.*;

import streamFocusi.taskiObj.fileForClass.*;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class TaskObj {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Bill", 10, 19));
        list.add(new Student("John", 6, 21));
        list.add(new Student("Kate", 11, 18));
        list.add(new Student("Sten", 9, 23));
        list.add(new Student("Marin", 8, 25));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1250, "Iphone 13", Month.APRIL));
        orders.add(new Order(1600, "Iphone 14proMax", Month.MAY));
        orders.add(new Order(2300, "Mac air M2", Month.JUNE));
        orders.add(new Order(300, "AirPods pro", Month.MAY));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 0
        toMap(list);

        // 1.
        avgMark(list);

        // 2.
        sumMonthOrder(orders, Month.MAY);

        // 3.
        maxPrice(orders);

        // 4.
        findNum(numbers);
    }

    // 0.
    public static void toMap(List<Student> list) {
        Map<String, Integer> collect = list.stream()
                .collect(Collectors.toMap(Student::getName, Student::getMark));
        System.out.println(collect);
    }

    // 1. Дан список студентов. Необходимо найти средний балл среди студентов, у которых возраст больше 20 лет.
    public static void avgMark(List<Student> list) {
        Double average = list.stream()
                .filter(el -> el.getAge() > 20)
                .map(Student::getMark)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(average);
    }

    // 2. Дан список заказов. Необходимо найти сумму всех заказов, сделанных в определенном месяце.
    public static void sumMonthOrder(List<Order> list, Month month) {
        double sum = list.stream()
                .filter(el -> el.getMonth() == month)
                .map(Order::getPrice)
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println(sum);
    }

    // 3. Дан список товаров. Необходимо найти товар с наибольшей ценой и вывести название.
    public static void maxPrice(List<Order> list) {
        Order order = list.stream()
                .sorted((l1, l2) -> (int) (l2.getPrice() * 100 - l1.getPrice() * 100))
                .findFirst()
                .orElse(new Order(0.0, "not fonded", Month.NUll));
        System.out.println(order.getNameOrder());
    }

    // 4. Дан список чисел. Необходимо найти произведение всех чисел, кратных 3.
    public static void findNum(List<Integer> list) {
        Integer integer = list.stream()
                .filter(el -> el % 3 == 0)
                .reduce((el1, el2) -> el1 * el2) // reduce - запоминает предедыдуший значения
//                .map((el1, el2) -> el1 * el2)
                .orElse(0);
        System.out.println(integer);
    }
}
