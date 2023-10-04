import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Pk BankCode", "1276387");
    }

    @Test
    public void testInitialBalance() {
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(1000);
        assertEquals(1000, bankAccount.getBalance());
    }

    @Test
    public void testWithdraw() {
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
        assertEquals(500, bankAccount.getBalance());
    }

    @Test
    public void testGetPreviousTransactionDeposit() {
        bankAccount.deposit(1000);
        assertEquals("Deposited: 1000", bankAccount.getPreviousTransaction());
    }

    @Test
    public void testGetPreviousTransactionWithdraw() {
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
        assertEquals("Withdraw: 500", bankAccount.getPreviousTransaction());
    }

    @Test
    public void testGetPreviousTransactionNoTransaction() {
        assertEquals("No Transaction Occurred", bankAccount.getPreviousTransaction());
    }

    // Add more test cases as needed
}
