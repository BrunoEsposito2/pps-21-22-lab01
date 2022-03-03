package lab01.tdd;

public class EvenStrategy implements SelectStrategy {

    public EvenStrategy() {
    }

    @Override
    public boolean apply(int element) {
        return element % 2 == 0;
    }
}
