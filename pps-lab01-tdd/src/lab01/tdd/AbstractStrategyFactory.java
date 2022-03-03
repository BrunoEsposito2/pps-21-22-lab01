package lab01.tdd;

public abstract class AbstractStrategyFactory {
    public abstract SelectStrategy getStrategy(final String strategy);
}
