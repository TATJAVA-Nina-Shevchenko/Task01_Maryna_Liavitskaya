package subtask08;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.subtask08.MultipleSum;

public class MultipleSumTest {

	@Test(dataProvider = "dpPositiveSumDivisible")
	public void testPositiveSumDivisible(int[] arrNatNum, int k, int expected) {
		assertEquals(new MultipleSum().sumDivisible(arrNatNum , k ), expected);
	}
	
	
	// ******Data Providers***********
	@DataProvider
	public Object[][] dpPositiveSumDivisible() {
		return new Object[][] {
			new Object[] { new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3, 18},
		
		};
	}
	
	

}
