import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lesson {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(25000,280,"BMW"));
        cars.add(new Car(22000,260,"Mercedes"));
        cars.add(new Car(15000,240,"Renault"));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>(){
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

    }
}
