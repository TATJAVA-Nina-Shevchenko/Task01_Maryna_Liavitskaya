package subtask02;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.subtask02.Main2;

public class Main2Test {

	@DataProvider
	public Object[][] dpPositive() {
		return new Object[][] { 
			new Object[]{ 0, 0, 0, Float.NaN }, 
			new Object[] { 1, 2, 3, 0.25 },
			new Object[] { -1, -2, -3, -3.75 }, };
	}

	@Test(dataProvider = "dpPositive")
	public void testPositiveCalculate(double a, double b, double c, double expected) {
		assertEquals(new Main2().calculate(a, b, c), expected, 0.01);

	}
	
}