package aloneTaskBank;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionList = new ArrayList<>();

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public void deposit(double amount) {
        if (balance > amount) {
            throw new AmoundNegativeExeption();
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            throw new AmoundNegativeExeption();
        }
        balance -= amount;

    }

    public void transfer(BankAccount destinationAccount, double amount) {
        if (destinationAccount.getBalance() > amount || balance < amount) {
            withdraw(amount);
            destinationAccount.deposit(amount);
            Transaction transaction = new Transaction(this, destinationAccount, amount, LocalDate.now());
            transactionList.add(transaction);
            Transaction transaction1 = new Transaction(destinationAccount, this, amount, LocalDate.now());
            destinationAccount.transactionList.add(transaction1);
        } else {
            System.out.println("You don't have enough cache");
        }
    }

    public void printAccountInfo() {
        System.out.println("Account number -> " + accountNumber);
        System.out.println("Сurrent balance -> " + balance);
    }
}
