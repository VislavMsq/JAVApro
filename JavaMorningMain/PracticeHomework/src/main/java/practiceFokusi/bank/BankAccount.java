package practiceFokusi.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

// Создайте класс "Банковский счет" (BankAccount), который имеет поля: номер счета (accountNumber), баланс (balance) и
// список транзакций (transactions). Добавьте методы для добавления и снятия денег со счета, а также для получения
// текущего баланса.
public class BankAccount {

    // 1. поля
    // 2. private funk
    // 3. constructor
    // 4. остальне
    // 5. get-set-toString-implements

    private String accountNumber;
    private long balance;
    private List<String> transactions;
    private String name;


    private String generateAccountNumber() {
        String out = "";
        Random rm = new Random();
        for (int i = 0; i < 9; i++) {
            out += Integer.toString(rm.nextInt(0, 10));
        }
        return out;
    }

    private void addTransactionHistory(String tr){
        this.transactions.add(tr); // [було знято n, додано, ...]

    }

    public BankAccount(String name) {
        this.accountNumber = generateAccountNumber();
        this.balance = 0;
        this.transactions = new ArrayList<>();
        this.name = name;
    }

    public boolean addMoney(long money) { // -1 0 1
        if (money <= 0) {
            return false;
        }
        this.balance = this.balance + money;
        addTransactionHistory("Add money " + money);
        return true;
    }

    // todo связи в методах, архитектура метода
    public Optional<Long> getMoney(long money) {
        // if invalid money-value
        if (money <= 0) {
            return Optional.empty();
        // if not enough money
        } else if (this.balance < money) {
            return Optional.empty();
        }
        this.balance = this.balance - money;
        addTransactionHistory("Ordered money " + money);
        return Optional.of(money);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "\naccountNumber: " + accountNumber +
                "\nbalance:       " + balance +
                "\ntransactions:  " + transactions +
                "\nname:          " + name + "\n}";
    }
}
