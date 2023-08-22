package TaskClass.DiningRoom;

import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
public class Cafeteria {
    private List<Order> orderList = new ArrayList<>();

    public void displayAllOrder() {
        System.out.println(orderList);
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    // Расчет средней суммы чека.
    public double averageOrderPrise() {
        return orderList.stream()
                .map(Order::getPrice)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.);
    }

    // Поиск самой популярной категории блюд.
    public List<Category> popularDish() {
        Map<Category, Long> collect = orderList.stream()
                .flatMap(el -> el.getDishList().stream())
                .map(Dish::getCategory)
                .collect(Collectors.groupingBy(el -> el, Collectors.counting()));


        Map<Long, List<Category>> collect2 = collect.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(
                        Map.Entry::getKey, Collectors.toList())));

        int num = collect2.keySet().stream()
                .mapToInt(Long::intValue)
                .max()
                .orElse(-1);

        if (num == -1) {
            return new ArrayList<>();
        }
        return collect2.get((long) num);
    }

    // Группировка заказов по часам.
    public Map<String, List<Order>> groupOrderByHour() {
        return orderList.stream()
                .collect(Collectors.groupingBy(el -> el.getDateOrder().split("::")[1].split("-")[0]));
    }

    // Сортировка заказов по сумме.
    public List<Order> sortByPrice() {
        return orderList.stream()
                .sorted(Comparator.comparing(Order::getPrice))
                .toList();
    }

}
