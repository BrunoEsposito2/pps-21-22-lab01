import lab01.example.model.AccountHolder;

import lab01.example.model.SimpleBankAccountWithAtm;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountWithAtmTest extends AbstractSimpleBankAccountTest {

    public static final int FEE = 1;

    @Override
    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);
    }

    @Test
    void testWithdraw() {
        final int deposited = 100;
        final int withdrawn = 70;
        bankAccount.deposit(accountHolder.getId(), deposited);
        bankAccount.withdraw(accountHolder.getId(), withdrawn);
        assertEquals(deposited - withdrawn - FEE, bankAccount.getBalance());
    }


}
