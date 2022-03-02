import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircularListEdgeTest extends AbstractCircularListTest {

    @Test
    void testInitialSize() {
        assertEquals(0, circularList.size());
    }

    @Test
    void testInitiallyIsEmpty() {
        assertTrue(circularList.isEmpty());
    }

    @Test
    void testCircularNext() {
        final int firstValueExpected = 2;
        circularList.add(2);
        circularList.add(3);
        circularList.next();
        circularList.next();
        assertEquals(firstValueExpected, circularList.next().get());
    }

    @Test
    void testCircularPrevious() {
        final int lastValueExpected = 3;
        final int previousValueExpected = 2;
        circularList.add(2);
        circularList.add(3);
        assertEquals(lastValueExpected, circularList.previous().get());
        assertEquals(previousValueExpected, circularList.previous().get());
    }
}
