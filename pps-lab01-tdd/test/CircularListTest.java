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
        circularList.add(2);
        assertEquals(2, circularList.next().get());
    }

    @Test
    void testEmptySize() {
        assertEquals(0, circularList.size());
    }

    @Test
    void testSize() {
        circularList.add(3);
        circularList.add(4);
        assertEquals(2, circularList.size());
    }

    @Test
    void testIsEmptySimple() {
        assertTrue(circularList.isEmpty());
    }

    @Test
    void testIsEmpty() {
        circularList.add(2);
        assertFalse(circularList.isEmpty());
    }

    @Test
    void testNext() {
        circularList.add(2);
        circularList.add(3);
        circularList.next();
        assertEquals(3, circularList.next().get());
    }

    @Test
    void testCircularNext() {
        circularList.add(2);
        circularList.add(3);
        circularList.next();
        circularList.next();
        assertEquals(2, circularList.next().get());
    }

    @Test
    void testCircularPrevious() {
        circularList.add(2);
        circularList.add(3);
        assertEquals(3, circularList.previous().get());
        assertEquals(2, circularList.previous().get());
    }

    @Test
    void testPrevious() {
        circularList.add(2);
        circularList.add(3);
        circularList.next();
        circularList.next();
        assertEquals(2, circularList.previous().get());
    }

    @Test
    void testReset() {
        circularList.add(2);
        circularList.add(3);
        circularList.add(8);
        circularList.next();
        circularList.next();
        circularList.reset();
        assertEquals(2, circularList.next().get());
    }

}
