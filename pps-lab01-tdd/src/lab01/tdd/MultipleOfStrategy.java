package lab01.tdd;

public class MultipleOfStrategy implements SelectStrategy {
    private static final int FACTOR = 5;

    public MultipleOfStrategy() {
    }

    @Override
    public boolean apply(int element) {
        return element % FACTOR == 0;
    }
}
