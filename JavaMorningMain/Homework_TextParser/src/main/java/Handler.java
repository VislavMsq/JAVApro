import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class Handler {
    private List<Factory> factoryList;

    public Handler(String fileName) {
        this.factoryList = Parser.parsElements(fileName);
    }

    //ай ди всех компаний
    public List<Integer> idAllFactory() {
        return factoryList.stream()
                .map(Factory::getId)
                .toList();
    }

    //самый дорогой СНЭК
    public Product mostExpensiveSome(String category) {
        return factoryList.stream()
                .map(Factory::getProduct)
                .filter(el -> el.getCategory().equals(category))
                .max(Comparator.comparing(Product::getPrice))
                .orElse(null);

    }

    //какого товара больше всего на складе в деньгах
    public Map<String, Double> mostCostProduct() {
        Map<String, List<Product>> stringListMap = factoryList.stream()
                .map(Factory::getProduct)
                .collect(Collectors.groupingBy(Product::getName, mapping(el -> el, toList())));

        Map<String, Double> stringDoubleMap = stringListMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        el -> el.getValue()
                                .stream()
                                .map(Product::getTotalPrice)
                                .mapToDouble(Float::doubleValue)
                                .sum()));

        return stringDoubleMap.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .toList().stream()
                .findFirst()
                .map(entry -> {
                    Map<String, Double> resultMap = new LinkedHashMap<>();
                    resultMap.put(entry.getKey(), entry.getValue());
                    return resultMap;
                })
                .orElse(new HashMap<>());
    }

    //какого ДРИНКС товара меньше всего на складе в деньгах
    public Map<String, Double> lessDrinkValueSum() {

        Map<String, List<Float>> doubleMap = factoryList.stream()
                .map(Factory::getProduct)
                .filter(el -> el.getCategory().equals("DRINKS"))
                .collect(Collectors.groupingBy(Product::getName, mapping(Product::getPrice, toList())));

        Map<String, Double> collect = doubleMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, el -> el.getValue().stream()
                        .mapToDouble(Float::doubleValue)
                        .sum()));

        return collect.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue())
                .toList().stream()
                .findFirst()
                .map(entry -> {
                    Map<String, Double> resultMap = new LinkedHashMap<>();
                    resultMap.put(entry.getKey(), entry.getValue());
                    return resultMap;
                })
                .orElse(new HashMap<>());
    }

    //количество видов акционного товара у ФУД
    public long quantityActionProd() {
        return factoryList.stream()
                .map(Factory::getProduct)
                .filter(el -> el.getCategory().equals("FOOD"))
                .filter(Product::isAdv)
                .map(Product::getName)
                .distinct()
                .count();
    }

    //сгруппировать по упакованным и нет
    public Map<Boolean, List<Product>> groupingByPacket() {
        return factoryList.stream()
                .map(Factory::getProduct)
                .collect(Collectors.partitioningBy(Product::isPacked));
    }

    //у какого ДРИНКС самая высокая маржа
    public Product moreMarginDrink() {
        return factoryList.stream()
                .map(Factory::getProduct)
                .filter(el -> el.getCategory().equals("DRINKS"))
                .max(Comparator.comparing(Product::getMargin))
                .orElse(null);
    }

    //средняя маржа по категории
    public double avgCategory(String category) {
        return factoryList.stream()
                .map(Factory::getProduct)
                .map(Product::getMargin)
                .mapToDouble(Float::doubleValue)
                .average()
                .orElse(0);
    }

    //первые три товара ФУД которые участвуют в акции и у которых самая низкая маржа
    public List<Product> firstThreeProdWithActionAndLowMargin() {
        return factoryList.stream()
                .map(Factory::getProduct)
                .filter(el -> el.getCategory().equals("FOOD"))
                .filter(Product::isAdv)
                .sorted(Comparator.comparing(Product::getMargin))
                .limit(3)
                .toList();
    }

    //поместить в три мапу отсортировав по ай ди. #37 - это ай ди.
    public TreeMap<Integer, Product> toTreeMap() {
        TreeMap<Integer, Product> factoryTreeMap = new TreeMap<>();
        factoryList.forEach(el -> factoryTreeMap.put(el.getId(), el.getProduct()));
        return factoryTreeMap;
    }

    //самый дешевый товар которого меньше всего на складе осталось в кг или штуках в зависимости от ISPACKED
    public Product mostCheapestProd() {
        return factoryList.stream()
                .map(Factory::getProduct)
                .min(Comparator.comparing(Product::getPrice).thenComparing(Product::getQuantity))
                .orElse(null);
    }
}
