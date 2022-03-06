package lab01.tdd;

public class StrategyFactory implements AbstractStrategyFactory {
    private static final int FACTOR = 5;
    private static final int CONSTANT = 23;

    public StrategyFactory() {
    }

    @Override
    public SelectStrategy getEqualsStrategy() {
        return (x) -> x == CONSTANT;
    }

    @Override
    public SelectStrategy getEvenStrategy() {
        return (x) -> x % 2 == 0;
    }

    @Override
    public SelectStrategy getMultipleOfStrategy() {
        return (x) -> x % FACTOR == 0;
    }
}
