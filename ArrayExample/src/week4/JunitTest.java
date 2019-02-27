package week4;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest {
//	@Test
//	public void testBinarySearch() {
//		int[] a = { 1, 5, 8, 12, 13 };
//		Assert.assertEquals(2, BinarySearch.binarySearch(a, 8));
//		Assert.assertEquals(0, BinarySearch.binarySearch(a, 1));
//		Assert.assertEquals(-1, BinarySearch.binarySearch(a, 23));
//	}

	@Test
	public void testMajorityElement() {
		int[] a = { 2, 3, 9, 2, 2 };
		Assert.assertEquals(1, MajorityElement.getMajorityElement(a, 0, a.length));

		int[] a1 = { 1, 2, 3, 4 };
		Assert.assertEquals(-1, MajorityElement.getMajorityElement(a1, 0, a1.length));

		int[] a2 = { 1, 2, 3, 1 };
		Assert.assertEquals(-1, MajorityElement.getMajorityElement(a2, 0, a2.length));
	}
}
