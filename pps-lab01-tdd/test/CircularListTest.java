import lab01.tdd.CircularList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    @BeforeEach
    void setUp() {
        circularList = new CircularList();
    }

    @Test
    void testAdd() {
        LinkedList<Object> list = new LinkedList<Object>();
        circularList.add(2);
        list.add(2)
        assertArrayEquals(list, circularList);
    }

    @Test
    void testSize() {
        assertEquals(0, circularList.size());
        circularList.add(3);
        assertEquals(1, circularList.size());
        circularList.add(4);
        assertEquals(2, circularList.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(circularList.isEmpty());
        circularList.add(2);
        assertFalse(circularList.isEmpty());
    }

    @Test
    void testNext() {
        circularList.add(2);
        circularList.add(3);
        assertEquals(2, circularList.next());
        assertEquals(3, circularList.next());
    }

    @Test
    void testPrevious() {
        circularList.add(2);
        circularList.add(3);
        assertEquals(3, circularList.previous());
    }

    @Test
    void testReset() {
        circularList.add(2);
        circularList.add(3);
        circularList.next();
        assertEquals(3, circularList.next());
        circularList.reset();
        assertEquals(2, circularList.next());
    }

}
