package example4;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    /*
    Напишите класс Product, который имеет следующие поля:

    name (тип String) - название продукта;
    price (тип double) - цена продукта.
    Реализуйте интерфейс Comparable для класса Product, чтобы объекты Product могли быть сравниваемыми
     на основе цены. При сравнении двух объектов Product должно возвращаться отрицательное число, если
     первый продукт дешевле второго, положительное число, если первый продукт дороже второго, и ноль,
     если продукты имеют одинаковую цену.
     */
    public static void main(String[] args) {

        Set<Products> productsSet = new HashSet<>();

        Products products = new Products("Iphone 12", 750);
        Products products2 = new Products("Iphone 13", 910);
        Products products3 = new Products("Iphone 14", 1000);
        Products products4 = new Products("Iphone 14pro", 1200);

        System.out.println(products.compareTo(products4));
    }
}
