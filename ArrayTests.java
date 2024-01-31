import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
	@Test 
	public void testReverseInPlaceLen3() {
    int[] input1 = { 3, 5, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 5, 3 }, input1);
	}
	@Test 
	public void testReverseInPlaceLen4() {
    int[] input1 = { -1, 3, 0, -5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ -5, 0, 3, -1 }, input1);
	}
	public void testReverseInPlaceLen0() {
    int[] input1 = {};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedLen3() {
    int[] input1 = {1,5,4 };
    assertArrayEquals(new int[]{ 4,5,1}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedGivesNewArr() {
    int[] input1 = { };
    assertNotEquals(input1, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAWL() {
    double[] arr = {-3, -100, 3, -9};
    assertEquals(-3.0, ArrayExamples.averageWithoutLowest(arr), 0.0001);
  }
  @Test
  public void testAWLRepeatLowest() {
    double[] arr = {1.0, 1.0, 5.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(arr), 0.0001);
  }
}
