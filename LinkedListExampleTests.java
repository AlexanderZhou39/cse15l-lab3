import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedListExampleTests {
    // private void assertLinkedListEquals(List<Integer> input, LinkedList ll) {
    //     List<Integer> copied = new ArrayList<Integer>();

    // }

    @Test
    public void testPrepend1() {
        LinkedList ll = new LinkedList();
        ll.prepend(1);
        ll.prepend(2);
        ll.prepend(3);
        assertEquals("3 2 1 ", ll.toString());
    }
    @Test
    public void testPrepend2() {
        LinkedList ll = new LinkedList();
        ll.prepend(5);
        ll.prepend(9);
        ll.prepend(0);
        assertEquals("0 9 5 ", ll.toString());
    }

    @Test 
    public void testFirst1() {
        LinkedList ll = new LinkedList();
        ll.prepend(5);
        ll.prepend(9);
        ll.prepend(0);
        assertEquals(0, ll.first());
    }
    @Test 
    public void testFirst2() {
        LinkedList ll = new LinkedList();
        ll.prepend(1);
        ll.prepend(2);
        ll.prepend(3);
        assertEquals(3, ll.first());
    }

    @Test 
    public void testLast1() {
        LinkedList ll = new LinkedList();
        ll.prepend(5);
        ll.prepend(9);
        ll.prepend(0);
        assertEquals(5, ll.last());
    }
    @Test 
    public void testLast2() {
        LinkedList ll = new LinkedList();
        ll.prepend(1);
        ll.prepend(2);
        ll.prepend(3);
        assertEquals(1, ll.last());
    }

    @Test 
    public void testToString1() {
        LinkedList ll = new LinkedList();
        assertEquals("", ll.toString());
    }
    @Test 
    public void testToString2() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        assertEquals("1 2 3 ", ll.toString());
    }

    @Test 
    public void testLength1() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        assertEquals(3, ll.length());
    }
    @Test 
    public void testLength2() {
        LinkedList ll = new LinkedList();
        ll.append(19);
        assertEquals(1, ll.length());
    }
    @Test 
    public void testLength3() {
        LinkedList ll = new LinkedList();
        assertEquals(0, ll.length());
    }
}