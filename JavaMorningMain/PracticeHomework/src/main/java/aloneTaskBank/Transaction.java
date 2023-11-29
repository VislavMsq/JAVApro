package aloneTaskBank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Random;

@Getter
public class Transaction {
    private int transactionId;
    private BankAccount sourceAccount;
    private BankAccount destinationAccount;
    private double amount;
    private LocalDate timestamp;

    public Transaction(BankAccount sourceAccount, BankAccount destinationAccount,
                       double amount, LocalDate timestamp) {
        this.transactionId = createID();
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    private int createID() {
        Random random = new Random();
        return random.nextInt(1000, 9999);
    }

    public String getTransactionDetails() {
        return "Transaction: " +
                "transactionId: " + transactionId +
                ", sourceAccount: " + sourceAccount +
                ", destinationAccount: " + destinationAccount +
                ", amount: " + amount +
                ", timestamp: " + timestamp;
    }
}
