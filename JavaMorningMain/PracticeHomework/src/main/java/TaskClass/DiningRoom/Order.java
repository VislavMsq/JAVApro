package TaskClass.DiningRoom;

import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
public class Order {
    private List<Dish> dishList = new ArrayList<>();
    private double price = 0.;
    private int table;
    private String dateOrder;

    private void generateDate() {
        LocalDateTime localDate = LocalDateTime.now();
        dateOrder = localDate.format(DateTimeFormatter.ofPattern("dd-MM::HH-mm"));
    }

    public Order(int table) {
        this.table = table;
    }


    @Override
    public String toString() {
        return " \nOrder[" +
                "\ndishList:  " + dishList +
                "\nprice:     " + price +
                "\ntable:     " + table +
                "\ndateOrder: " + dateOrder + "]";
    }


    public void getCheck(String date) {
        Pattern pattern = Pattern.compile("\\d\\d-\\d\\d::\\d\\d-\\d\\d");
        Matcher matcher = pattern.matcher(date);

        if (matcher.find()) {
            dateOrder = date;
        } else {
            throw new DateMistakeException();
        }
        double sumCheck = 0.;
        for (Dish dish : dishList) {
            sumCheck += dish.getPrice();
        }
        price = sumCheck;
    }

    public void addDish(Dish dish) {
        dishList.add(dish);

        double sum = 0;
        for (Dish dish1 : dishList) {
            sum += dish1.getPrice();
        }
        price = sum;
    }
}
