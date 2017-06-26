package subtask05;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.subtask05.PowerInvolver;

public class PowerInvolverTest {
	private static final double delta = 0.001; //accuracy
	
	@Test(dataProvider = "dpPositiveInvolveTwo")
	public void testPositiveInvolveTwo(double n, double expected) {
		assertEquals(new PowerInvolver().involveTwo(n), expected, delta );
	}
	
	@Test(dataProvider = "dpPositiveInvolveFour")
	public void testPositiveInvolveFour(double n, double expected) {
		assertEquals(new PowerInvolver().involveFour(n), expected, delta );
	}
	
	// ******Data Providers***********
	@DataProvider
	public Object[][] dpPositiveInvolveTwo() {
		return new Object[][] { 
			new Object[] { 0, 0},
			new Object[] { 1, 1},
			new Object[] { -1, 1},
			new Object[] { 2, 4},}; 

	}

	@DataProvider
	public Object[][] dpPositiveInvolveFour() {
		return new Object[][] { 
			new Object[] { 0, 0},
			new Object[] { 1, 1},
			new Object[] { -1, 1},
			new Object[] { 2, 16},}; 

	}


}
