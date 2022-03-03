import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest extends AbstractCircularListTest {

    @Test
    void testAdd() {
        final int value = 2;
        circularList.add(value);
        assertEquals(value, circularList.next().get());
    }

    @Test
    void testSize() {
        final int expectedSize = 2;
        circularList.add(3);
        circularList.add(4);
        assertEquals(expectedSize, circularList.size());
    }

    @Test
    void testIsEmpty() {
        final int value = 2;
        circularList.add(value);
        assertFalse(circularList.isEmpty());
    }

    @Test
    void testNext() {
        final int nextValueExpected = 3;
        circularList.add(2);
        circularList.add(3);
        circularList.next();
        assertEquals(nextValueExpected, circularList.next().get());
    }

    @Test
    void testPrevious() {
        final int previousValueExpected = 2;
        circularList.add(2);
        circularList.add(3);
        circularList.next();
        circularList.next();
        assertEquals(previousValueExpected, circularList.previous().get());
    }

    @Test
    void testReset() {
        final int firstValueExpected = 2;
        circularList.add(2);
        circularList.add(3);
        circularList.add(8);
        circularList.next();
        circularList.next();
        circularList.reset();
        assertEquals(firstValueExpected, circularList.next().get());
    }

    @Test
    void testNextEvenStrategy() {
        circularList.add(3);
        circularList.add(5);
        circularList.add(8);
        assertEquals(8, circularList.next(getEvenStrategy()).get());
    }

    @Test
    void testNextMultipleOfStrategy() {
        circularList.add(6);
        circularList.add(10);
        assertEquals(10, circularList.next(getMultipleOfStrategy()).get());
    }

    @Test
    void testNextEqualsStrategy() {
        circularList.add(6);
        circularList.add(4);
        circularList.add(23);
        circularList.add(9);
        assertEquals(23, circularList.next(getEqualsStrategy()).get());
    }

}
