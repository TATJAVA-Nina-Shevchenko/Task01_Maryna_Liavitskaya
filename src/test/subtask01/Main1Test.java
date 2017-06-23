package subtask01;

import org.testng.annotations.Test;

import main.subtask01.Main1;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;

public class Main1Test {
//	@Test(dataProvider = "dp")
//	public void f(Integer n, String s) {
//	}

	@DataProvider
	public Object[][] dpPositive() {
		return new Object[][] {
			new Object[] { 0, 0, 0, Float.NaN}, 
			new Object[] { 1, 2, 2, 1 },
			new Object[] { -1, 1, 1, -1 },
			new Object[] { 	2147483647, 1, 10, 	2147483638 },
		};
	}

	@Test(dataProvider = "dpPositive")
	public void testPositiveCompareSum(int a, int b, int c, int d) {
		assertTrue(new Main1().compareSum(a, b, c, d));
	}
	
	@DataProvider
	public Object[][] dpNegative() {
		return new Object[][] {
			new Object[] { 0, 2, 0, 0}, 
			new Object[] { -1, -1, 1, 1 },
			new Object[] { 	2147483647, 1, 10, 	-2147483638 },
		};
	}
	
	@Test(dataProvider = "dpNegative")
	public void testNegativeCompareSum(int a, int b, int c, int d) {
		assertFalse(new Main1().compareSum(a, b, c, d));
	}
}
