import lab01.tdd.BasicCircularList;
import lab01.tdd.CircularList;
import org.junit.jupiter.api.BeforeEach;

public class AbstractCircularListTest {
    protected CircularList circularList;

    @BeforeEach
    void setup() {
        circularList = new BasicCircularList();
    }
}
