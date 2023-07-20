import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class BankCard {
    private String currency;
    private Status status;
    private String number;
    private String MM_YY;
    private String CVV;
}
