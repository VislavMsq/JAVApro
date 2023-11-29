import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    /*
Теория:
    Существуют высокоуровневые инструменты для работы со структурами данных
    Компоратор и Итератор. Они представленны интерфейсами Comparable и Iterable.
    Интерфейсы -  контракт, который должен риализовать класс наследний.

    Итератор - перебиратель, то что помогает перебирать структуру данных:

    Для простоты рассмотрим уже знакомый цикл for:

    for(int i = 0; i < 10; I++)
    переменная i - итератор, перебирает цикл
     */
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(7);
        System.out.println("Arrays: " + num);
        Collections.sort(num);
        System.out.println("Arrays: " + num);


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(10000,120,"BMW"));
        cars.add(new Car(30000,70,"Lanos"));
        cars.add(new Car(8000,110,"Renault"));

        System.out.println("Cars: \n" + cars);

        Collections.sort(cars);
        System.out.println("Cars: \n" + cars);

        Comparator<Car> comparator = new Comparator<Car>() {   // анонимный класс - реализуем контракт в точке создания обьекта
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price;
            }
        };

        Collections.sort(cars,comparator);
        System.out.println("Cars: \n" + cars);



    }
}
