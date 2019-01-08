import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author sagars
 *
 */
public class ArrayTest {

	MyArray mArray;

	@Before
	public void setUp() throws Exception {
		mArray = new MyArray(7);
		Assert.assertTrue(mArray.add(1));
		Assert.assertTrue(mArray.add(2));
		Assert.assertTrue(mArray.add(3));
		Assert.assertTrue(mArray.add(4));
		Assert.assertTrue(mArray.add(5));
		Assert.assertTrue(mArray.add(6));
		Assert.assertTrue(mArray.add(7));
	}

	@Test
	public void testAdd() {
		Assert.assertTrue(mArray.printArray(null));
		Assert.assertFalse(mArray.add(12));
	}

	@Test
	public void testGet() {
		Assert.assertEquals(7, mArray.getAtIndex(6));
	}

	@Test
	public void testDelete() {
		// Assert.assertTrue(mArray.deleteAtIndex(0));
		// Assert.assertTrue(mArray.printArray(null));
		// Assert.assertTrue(mArray.deleteAtIndex(0));
		// Assert.assertTrue(mArray.printArray(null));
		// Assert.assertTrue(mArray.deleteAtIndex(0));
		// Assert.assertTrue(mArray.printArray(null));
	}

	@Test
	public void testRotate() {
		Assert.assertTrue(mArray.printArray(null));
		int[] roataeVlaue = mArray.rotateArray1(1);
		roataeVlaue = mArray.rotateArray1(2);
		roataeVlaue = mArray.rotateArray1(3);
		roataeVlaue = mArray.rotateArray1(4);
		roataeVlaue = mArray.rotateArray1(5);
		// Assert.assertTrue(mArray.printArray(roataeVlaue));
		// Assert.assertSame(mArray, mArray);

	}

	@Test
	public void testSumArray() {
		int[] array1 = { 3, 6, 4, 8, 9 };
		int[] array1_result = { 27, 24, 26, 22, 21 };
		Assert.assertArrayEquals(array1_result, (mArray.SumArray(array1, 5)));

		int[] array2 = { 4, 5, 7, 3, 10, 1 };
		int[] array2_result = { 26, 25, 23, 27, 20, 29 };
		Assert.assertArrayEquals(array2_result, (mArray.SumArray(array2, 6)));
	}

	@Test
	public void testTwoSum() {
		int[] array1 = { 2, 7, 11, 15 };
		int[] array1_result = { 0, 1 };
		Assert.assertArrayEquals(array1_result, (mArray.twoSum(array1, 9)));

		int[] array2_result = { 1, 3 };
		Assert.assertArrayEquals(array2_result, (mArray.twoSum1(array1, 22)));

		Assert.assertArrayEquals(array2_result, (mArray.twoSum2(array1, 22)));

	}
}