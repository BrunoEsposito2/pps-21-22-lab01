package lab01.example.model;

public class SimpleBankAccountWithAtm extends AbstractSimpleBankAccount {

    private static final double FEE = 1;

    public SimpleBankAccountWithAtm(final AccountHolder holder, final double balance) {
        super(balance, holder);
    }

    @Override
    public double getFee() {
        return FEE;
    }
}
