package lab01.tdd;

public interface AbstractStrategyFactory {
    public SelectStrategy getEqualsStrategy();

    public SelectStrategy getEvenStrategy();

    public SelectStrategy getMultipleOfStrategy();
}
