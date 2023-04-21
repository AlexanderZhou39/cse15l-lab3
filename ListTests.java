import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    public class StringCheckerTrue implements StringChecker {
        public boolean checkString(String s) {
            return true;
        }
    }

    private void assertListEquals(List<String> expected, List<String> result) {
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals("Checked for index " + i, expected.get(i), result.get(i));
        }
    }

    @Test 
    public void testFilter() {
        StringChecker sc = new StringCheckerTrue();
        List<String> input = Arrays.asList("bob", "charles", "jill");
        assertListEquals(input, ListExamples.filter(input, sc));
    }

    @Test
    public void testMerge1() {
        List<String> l1 = Arrays.asList("a", "b", "c");
        List<String> l2 = Arrays.asList("a", "b", "c");
        List<String> expected = Arrays.asList(
            "a", "a", "b", "b", "c", "c"
        );
        assertListEquals(expected, ListExamples.merge(l1, l2));
    }
    @Test
    public void testMerge2() {
        List<String> l1 = Arrays.asList("a", "b", "c");
        List<String> l2 = Arrays.asList("a", "b", "c", "d");
        List<String> expected = Arrays.asList(
            "a", "a", "b", "b", "c", "c", "d"
        );
        assertListEquals(expected, ListExamples.merge(l1, l2));
    }
    @Test
    public void testMerge3() {
        List<String> l1 = Arrays.asList("a", "b", "c", "d");
        List<String> l2 = Arrays.asList("a", "b", "c");
        List<String> expected = Arrays.asList(
            "a", "a", "b", "b", "c", "c", "d"
        );
        assertListEquals(expected, ListExamples.merge(l1, l2));
    }
}