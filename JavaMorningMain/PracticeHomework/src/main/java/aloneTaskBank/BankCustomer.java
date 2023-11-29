package aloneTaskBank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@Setter
public class BankCustomer {
    private String firstName;
    private String lastName;
    private List<BankAccount> accounts;

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public double getTotalBalance() {
        double sum = 0;
        for (BankAccount account : accounts) {
            sum += account.getBalance();
        }
        return sum;
    }

    public BankAccount getAccountByNumber(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void removeAccount(BankAccount account) {
        accounts.remove(account);
    }

    public List<BankAccount> getAccountsWithPositiveBalance() {
        List<BankAccount> bankAccounts = new ArrayList<>();
        for (BankAccount bankAccount : accounts) {
            if (bankAccount.getBalance() > 0) {
                bankAccounts.add(bankAccount);
            } else {
                System.out.println("Your account has a negative balance");
            }
        }
        return bankAccounts;
    }
}
