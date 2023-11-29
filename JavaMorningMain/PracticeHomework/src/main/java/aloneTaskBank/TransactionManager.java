package aloneTaskBank;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class TransactionManager {
    private List<Transaction> transactions;
    // todo метод дописать историю тренз + поле (лист траз) в картах
    private void addTransaction(Transaction transaction) {
        if (transaction == null) {
            throw new TransactionContentException();
        }
        transactions.add(transaction);
    }

    public List<Transaction> getTransactionsByAccount(BankAccount account) {
        List<Transaction> transactionList = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getSourceAccount().equals(account) || transaction.getDestinationAccount().equals(account)) {
                transactionList.add(transaction);
            }
        }
        return transactionList;
    }
}
