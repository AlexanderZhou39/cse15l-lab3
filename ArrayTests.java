import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  private void generalTestReverseInPlace(int[] input, int[] expected) {
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(expected, input);
  }
  private void generalTestReversed(int[] input, int[] expected) {
    ArrayExamples.reversed(input);
    assertArrayEquals(expected, input);
  }

	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
	@Test 
	public void testReverseInPlace2() {
    generalTestReverseInPlace(
      new int[] { 1, 2, 3 },
      new int[] { 3, 2, 1 }
    );
	}
	@Test 
	public void testReverseInPlace3() {
    generalTestReverseInPlace(
      new int[] { 5, 6, 7, 1 },
      new int[] { 1, 7, 6, 5 }
    );
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed2() {
    generalTestReversed(
      new int[] { 1, 2, 3 },
      new int[] { 3, 2, 1 }
    );
  }
  @Test
  public void testReversed3() {
    generalTestReversed(
      new int[] { 5, 6, 7, 1 },
      new int[] { 1, 7, 6, 5 }
    );
  }
}
