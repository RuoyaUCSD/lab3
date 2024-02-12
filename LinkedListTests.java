import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.*;

public class LinkedListTests {
    @Test
    public void test3Ele() {
        LinkedList ll = new LinkedList();
        ll.append(4);
        ll.append(-5);
        ll.append(2);
        assertEquals(3, ll.length());
        assertEquals("4 -5 2", ll.toString());
        assertEquals(4, ll.first());
        assertEquals(2, ll.last());
    }

    @Test
    public void test1Ele() {
        LinkedList ll = new LinkedList();
        ll.append(0);
        assertEquals(1, ll.length());
        assertEquals("0", ll.toString());
        assertEquals(0, ll.first());
        assertEquals(0, ll.last());
    }

    @Test
    public void test0Ele() {
        LinkedList ll = new LinkedList();
        assertEquals(0, ll.length());
        assertEquals("", ll.toString());
        assertThrows(NoSuchElementException.class, () -> ll.first());
        assertThrows(NoSuchElementException.class, () -> ll.last());
    }
    
}
