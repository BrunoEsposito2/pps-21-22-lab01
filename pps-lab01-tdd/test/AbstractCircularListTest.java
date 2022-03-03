import lab01.tdd.*;
import org.junit.jupiter.api.BeforeEach;

public class AbstractCircularListTest {
    protected CircularList circularList;
    protected AbstractStrategyFactory strategyFactory;

    @BeforeEach
    void setup() {
        circularList = new BasicCircularList();
        strategyFactory = new StrategyFactory();
    }
}
