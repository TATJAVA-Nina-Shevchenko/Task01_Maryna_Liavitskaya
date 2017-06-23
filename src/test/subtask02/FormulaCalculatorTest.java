package subtask02;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.subtask02.FormulaCalculator;
public class FormulaCalculatorTest {

	@DataProvider
	public Object[][] dpPositive() {
		return new Object[][] { 
			new Object[]{ 0, 0, 0, Float.NaN }, 
			new Object[] { 1, 2, 3, 0.25 },
			new Object[] { -1, -2, -3, -3.75 }, };
	}

	@Test(dataProvider = "dpPositive")
	public void testPositiveCalculate(double a, double b, double c, double expected) {
		assertEquals(new FormulaCalculator(a, b, c).calculate(), expected, 0.01);
	}
	
//	@Test(dataProvider = "dpPositive")
//	public void testFormulaCalculator(double a, double b, double c, double d) {
//		FormulaCalculator expected = new FormulaCalculator();
//		
//		assertEquals(new FormulaCalculator(a, b, c).calculate(), expected, 0.01);
//	}
	
}
