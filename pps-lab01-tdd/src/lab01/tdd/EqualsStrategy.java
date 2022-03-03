package lab01.tdd;

public class EqualsStrategy implements SelectStrategy {
    private static final int CONSTANT = 23;

    public EqualsStrategy() {
    }

    @Override
    public boolean apply(int element) {
        return element == CONSTANT;
    }
}
