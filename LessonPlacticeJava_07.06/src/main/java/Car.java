import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Car implements Comparable {
    int price;
    double speed;
    String brand;


    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", speed=" + speed +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car) o;              // преобразуем параметр к типу Car, чтобы сравнить обьекты
//        return (int) (this.price) - (int) (car.price);
        return this.brand.compareTo(car.brand);
    }
}
