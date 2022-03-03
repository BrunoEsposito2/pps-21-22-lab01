import lab01.example.model.AccountHolder;
import lab01.example.model.SimpleBankAccount;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountTest extends AbstractSimpleBankAccountTest {

    @Override
    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccount(accountHolder, 0);
    }

    @Override
    @Test
    void testWithdraw() {
        final int deposited = 100;
        final int withdrawn = 70;
        bankAccount.deposit(accountHolder.getId(), deposited);
        bankAccount.withdraw(accountHolder.getId(), withdrawn);
        assertEquals(deposited - withdrawn, bankAccount.getBalance());
    }

}
