import lab01.tdd.BasicCircularList;
import lab01.tdd.CircularList;
import lab01.tdd.SelectStrategy;
import org.junit.jupiter.api.BeforeEach;

public class AbstractCircularListTest {

    private static final int FACTOR = 5;
    private static final int CONSTANT = 23;

    private static final SelectStrategy EVEN_STRATEGY = (x) -> x % 2 == 0;
    private static final SelectStrategy MULTIPLE_OF_STRATEGY = (x) -> x % FACTOR == 0;
    private static final SelectStrategy EQUALS_STRATEGY = (x) -> x == CONSTANT;

    protected CircularList circularList;

    @BeforeEach
    void setup() {
        circularList = new BasicCircularList();
    }

    protected SelectStrategy getEvenStrategy() {
        return EVEN_STRATEGY;
    }

    protected SelectStrategy getMultipleOfStrategy() {
        return MULTIPLE_OF_STRATEGY;
    }

    protected SelectStrategy getEqualsStrategy() {
        return EQUALS_STRATEGY;
    }
}
