package subtask10;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.subtask10.MatrixFormer;

public class MatrixFormerTest {

	@Test(dataProvider = "dpPositiveFormMatrix")
	public void testFormMatrix(int n, int[][] expected) {
		assertTrue(Arrays.deepEquals(new MatrixFormer().formMatrix(n), expected));
	}
	
	
	// ******Data Providers***********
	@DataProvider
	public Object[][] dpPositiveFormMatrix() {
		return new Object[][] {
			new Object[] { 4, new int[][]{	new int[]{1, 2, 3, 4},
											new int[]{4, 3, 2, 1},
											new int[]{1, 2, 3, 4},
											new int[]{4, 3, 2, 1},
										}
						}
		};
	}
	
	

}
