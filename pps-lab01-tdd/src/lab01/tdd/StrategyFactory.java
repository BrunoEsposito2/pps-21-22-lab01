package lab01.tdd;

public class StrategyFactory extends AbstractStrategyFactory {
    private static final String EVEN_STRATEGY = "EVEN";
    private static final String MULTIPLE_OF_STRATEGY = "MULTIPLE";
    private static final String EQUALS_STRATEGY = "EQUALS";

    public StrategyFactory() {
    }

    @Override
    public SelectStrategy getStrategy(final String strategy) {
        if (strategy.equalsIgnoreCase(EVEN_STRATEGY)) {
            return new EvenStrategy();
        } else if (strategy.equalsIgnoreCase(MULTIPLE_OF_STRATEGY)) {
            return new MultipleOfStrategy();
        } else if (strategy.equalsIgnoreCase(EQUALS_STRATEGY)) {
            return new EqualsStrategy();
        }
        return null;
    }
}
