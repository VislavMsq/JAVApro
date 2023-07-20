import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.function.Function;

@AllArgsConstructor
@Getter
public class Client{
    private String firstName;
    private String lastName;
    private int balance;
    private BankCard bankCard;

    @Override
    public String toString() {
        return "\nClient{" +
                "\nfirstName: " + firstName +
                "\nlastName:  " + lastName +
                "\nbalance:   " + balance +
                "\nbankCard:  " + bankCard +
                '}';
    }

}
