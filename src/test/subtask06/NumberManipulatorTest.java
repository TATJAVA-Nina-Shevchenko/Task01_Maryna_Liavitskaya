package subtask06;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.subtask06.NumberManipulator;

public class NumberManipulatorTest {

	@Test(dataProvider = "dpPositiveFindMin")
	public void testPositiveFindMin(String[] args, int initMin, int expected) {
		assertEquals(new NumberManipulator().findMin(args, initMin), expected);
	}
	
	@Test(dataProvider = "dpPositiveFindMax")
	public void testPositiveFindMax(String[] args, int initMin, int expected) {
		assertEquals(new NumberManipulator().findMax(args, initMin), expected);
	}
	

	// ******Data Providers***********
	@DataProvider
	public Object[][] dpPositiveFindMin() {
		return new Object[][] { new Object[] { new String[] { "1", "2", "3", "4" }, 1, 1 },
				new Object[] { new String[] { "-1", "-2", "-3", "-4" }, -1, -4 }, };
	}
	
	@DataProvider
	public Object[][] dpPositiveFindMax() {
		return new Object[][] { new Object[] { new String[] { "1", "2", "3", "4" }, 1, 4 },
				new Object[] { new String[] { "-1", "-2", "-3", "-4" }, -1, -1 }, };
	}

}
