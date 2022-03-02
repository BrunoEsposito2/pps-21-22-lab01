import lab01.tdd.BasicCircularList;
import lab01.tdd.CircularList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularList circularList;

    @BeforeEach
    void setUp() {
        circularList = new BasicCircularList();
    }

    @Test
    void testAdd() {
        final int value = 2;
        circularList.add(value);
        assertEquals(value, circularList.next().get());
    }

    @Test
    void testEmptySize() {
        assertEquals(0, circularList.size());
    }

    @Test
    void testSize() {
        final int expectedSize = 2;
        circularList.add(3);
        circularList.add(4);
        assertEquals(expectedSize, circularList.size());
    }

    @Test
    void testIsEmptySimple() {
        assertTrue(circularList.isEmpty());
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

}
