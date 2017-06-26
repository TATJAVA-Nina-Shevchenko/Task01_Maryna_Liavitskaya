package subtask09;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.subtask09.ArrayMerger;

public class ArrayMergerTest {

	@Test(dataProvider = "dpPositiveMerge")
	public void testPositiveMerge(int k, int[] arr, int[] arrFirst, int[] arrSecond, int[] expected) {
		assertEquals(new ArrayMerger().merge( k, arr, arrFirst,  arrSecond), expected);
	}
	
	
	// ******Data Providers***********
	@DataProvider
	public Object[][] dpPositiveMerge() {
		return new Object[][] {
			new Object[] { 0, new int[10], new int[]{1, 1, 1, 1}, new int[]{2, 2, 2, 2, 2, 2} , new int[]{2, 2, 2, 2, 2, 2, 1, 1, 1, 1},},
			new Object[] { 3, new int[10], new int[]{1, 1, 1, 1}, new int[]{2, 2, 2, 2, 2, 2} , new int[]{1, 1, 1, 2, 2, 2, 2, 2, 2, 1},},
		};
	}
	
	

}
