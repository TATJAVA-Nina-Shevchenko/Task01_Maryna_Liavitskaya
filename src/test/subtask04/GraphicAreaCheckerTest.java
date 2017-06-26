package subtask04;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.subtask04.GraphicAreaChecker;

public class GraphicAreaCheckerTest {
	
	@Test(dataProvider = "dpPositiveIsInGraphicArea")
	public void testPositiveIsInGraphicArea(int x, int y) {
		assertTrue(new GraphicAreaChecker().isInGraphicArea(x, y) );
	}
	
	@Test(dataProvider = "dpNegativeIsInGraphicArea")
	public void testNegativeIsInGraphicArea(int x, int y) {
		assertFalse(new GraphicAreaChecker().isInGraphicArea(x, y) );
	}
	
	// ******Data Providers***********
	@DataProvider
	public Object[][] dpPositiveIsInGraphicArea() {
		return new Object[][] { 
			new Object[] { -4, -3},
			new Object[] { 0, 0},
			new Object[] { 2, 4},}; 

	}

	@DataProvider
	public Object[][] dpNegativeIsInGraphicArea() {
		return new Object[][] { 
			new Object[] { -3, 1},
			new Object[] { 3, 1},
			new Object[] { 10, 7},};
	}

}
