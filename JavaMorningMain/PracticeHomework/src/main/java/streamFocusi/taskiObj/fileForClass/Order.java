package streamFocusi.taskiObj.fileForClass;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class Order {
    private double price;
    private String nameOrder;
    private Month month;

    @Override
    public String toString() {
        return "Order{" +
                "\nprice: " + price +
                "\nnameOrder: " + nameOrder +
                "\nmonth: " + month +
                "\n}";
    }
}
