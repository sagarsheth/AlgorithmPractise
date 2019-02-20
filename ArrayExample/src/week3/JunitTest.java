package week3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

//	@Test
//	public void testChange() {
//		Assert.assertEquals(1, Change.getChange(5));
//		Assert.assertEquals(3, Change.getChange(3));
//		Assert.assertEquals(2, Change.getChange(6));
//		Assert.assertEquals(1, Change.getChange(1));
//		Assert.assertEquals(2, Change.getChange(20));
//		Assert.assertEquals(7, Change.getChange(38));
//	}

//	@Test
//	public void testValue() {
//		int[] values = { 60, 100, 120 };
//		int[] weights = { 20, 50, 30 };
//		Assert.assertEquals(180, FractionalKnapsack.getOptimalValue(50, values, weights));
//		int[] values1 = { 500 };
//		int[] weights1 = { 30 };
//		Assert.assertEquals(500, FractionalKnapsack.getOptimalValue(1000, values1, weights1));	
//		int[] values1 = { 500 };
//		int[] weights1 = { 30 };
//		Assert.assertEquals(500, FractionalKnapsack.getOptimalValue(1000, values1, weights1));
//		Assert.assertEquals(3, Change.getChange(3));
//		Assert.assertEquals(2, Change.getChange(6));
//		Assert.assertEquals(1, Change.getChange(1));
//		Assert.assertEquals(2, Change.getChange(20));
//		Assert.assertEquals(7, Change.getChange(38));
//	}

	@Test
	public void testDifferenceSum() {

		List<Integer> summands = new ArrayList<Integer>();
		summands.add(1);
		summands.add(3);	
		Assert.assertEquals(summands, DifferentSummands.optimalSummands(4));
	}

}
