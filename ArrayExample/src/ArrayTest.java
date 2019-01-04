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
}