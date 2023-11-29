package aloneTaskBank;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit() {
        BankAccount bankAccount = Mockito.mock(BankAccount.class);
        Mockito.when(bankAccount.getBalance()).thenReturn();

        assertEquals(10.0,bankAccount.deposit(10));
    }

    @Test
    void withdraw() {
    }

    @Test
    void transfer() {
    }
}