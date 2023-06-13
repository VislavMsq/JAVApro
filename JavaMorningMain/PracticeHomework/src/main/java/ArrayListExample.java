import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // метод add добовляем элементы в ArrayList
        list.add("яблоко");
        list.add("банан");
        list.add("апельсин");
        // методом get(1) получаем доступ к элементу под этим индексом
        String fruit = list.get(1);
        System.out.println("Fruit: " + fruit);
        // итерация по ArrayList
        for(String elem : list ){
            System.out.println("Element: " + elem);
        }
        // метод contains проверяет наличие элемента в ArrayList
        boolean contains = list.contains("банан");
        System.out.println("Contains: " + contains);
    }
}
