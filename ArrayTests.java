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
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace1() {
    int[] input2 = {3, 5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{5,3}, input2);
  }

  @Test 
  public void testReversed1() {
    int[] input3 = {1, 2, 3, 4};
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input3));
  }

  @Test 
  public void TestAverageWithoutLowest(){
     double[] input1 = {2.0, 3.0, 4.0, 2.0};
     assertEquals(3, ArrayExamples.averageWithoutLowest(input1), 1e-15);
  }
}
