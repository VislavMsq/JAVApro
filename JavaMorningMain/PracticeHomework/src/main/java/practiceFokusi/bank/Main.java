package practiceFokusi.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Visa");

        String accountNumber = bankAccount1.getAccountNumber();
        System.out.println("Created account with number -> " + accountNumber);

        bankAccount1.addMoney(500);
        System.out.println("Balance -> " + bankAccount1.getBalance());

        bankAccount1.getMoney(200);
        System.out.println("Balance -> " + bankAccount1.getBalance());

        System.out.println(bankAccount1.getTransactions());


        // --------------------------------



    }
}
