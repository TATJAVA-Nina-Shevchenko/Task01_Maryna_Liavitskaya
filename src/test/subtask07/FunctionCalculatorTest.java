package subtask07;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.subtask07.FunctionCalculator;

public class FunctionCalculatorTest {
	private static final double delta = 0.001; //accuracy

	@Test(dataProvider = "dpPositiveCalculatedFunction")
	public void testPositiveFindMin(double x, double expected) {
		assertEquals(new FunctionCalculator().calculatedFunction(x), expected, delta);
	}
	
	
	// ******Data Providers***********
	@DataProvider
	public Object[][] dpPositiveCalculatedFunction() {
		return new Object[][] {
			new Object[] { 1.0, 1.124 },
			new Object[] { 0, -1},
			new Object[] { -2, 1.48 },
		};
	}
	
	

}
