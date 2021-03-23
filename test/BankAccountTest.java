import com.easv.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void getAccountNumber() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void getInterestRate() {
    }

    @Test
    void deposit() {
        double initialBalance = 2000;
        double amount = 1000;
        BankAccount b2 = new BankAccount(2, initialBalance);

        b2.deposit(amount);

        double actualBalance = 3000;
        double expectedBalance = b2.getBalance();

        Assertions.assertEquals(actualBalance, expectedBalance);
    }

    @Test
    public void testInvalidDeposit() {

        // Arrange
        double initialBalance = 500.00;
        double amount = -100.00;
        BankAccount account = new BankAccount(1111, initialBalance);

        // Act + assert
        Exception err = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(amount);
        });

        // Extra assert
        String expectedMessage = "Amount must be a positive number";
        String actualMessage = err.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void withdraw() {
        double initialBalance = 1000;
        double amount = 500;
        BankAccount b1 = new BankAccount(1, initialBalance);

        b1.withdraw(amount);

        double actualBalance = 500;
        double expectedBalance = b1.getBalance();

        Assertions.assertEquals(expectedBalance, actualBalance);
    }

    @Test
    void setInterestRate() {
    }

    @Test
    void addInterest() {
    }
}