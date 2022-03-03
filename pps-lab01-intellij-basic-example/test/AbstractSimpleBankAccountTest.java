import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AbstractSimpleBankAccountTest {
    protected AccountHolder accountHolder;
    protected BankAccount bankAccount;

    @BeforeEach
    abstract void beforeEach();

    @Test
    void testInitialBalance() {
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        final int deposited = 100;
        bankAccount.deposit(accountHolder.getId(), deposited);
        assertEquals(deposited, bankAccount.getBalance());
    }

    @Test
    void testWrongDeposit() {
        final int deposited = 100;
        final int wrongDeposited = 50;
        final int wrongId = 2;
        bankAccount.deposit(accountHolder.getId(), deposited);
        bankAccount.deposit(wrongId, wrongDeposited);
        assertEquals(deposited, bankAccount.getBalance());
    }

    @Test
    abstract void testWithdraw();

    @Test
    void testWrongWithdraw() {
        final int deposited = 100;
        final int wrongWithdrawn = 70;
        final int wrongId = 2;
        bankAccount.deposit(accountHolder.getId(), deposited);
        bankAccount.withdraw(wrongId, wrongWithdrawn);
        assertEquals(deposited, bankAccount.getBalance());
    }
}
