import lab01.tdd.BasicCircularList;
import lab01.tdd.CircularList;
import lab01.tdd.SelectStrategy;
import org.junit.jupiter.api.BeforeEach;

public class AbstractCircularListTest {

    protected static final int FACTOR = 5;
    protected static final int CONSTANT = 23;

    protected static final SelectStrategy EVEN_STRATEGY = (x) -> x % 2 == 0;
    protected static final SelectStrategy MULTIPLE_OF_STRATEGY = (x) -> x % FACTOR == 0;
    protected static final SelectStrategy EQUALS_STRATEGY = (x) -> x == CONSTANT;

    protected CircularList circularList;

    @BeforeEach
    void setup() {
        circularList = new BasicCircularList();
    }
}
