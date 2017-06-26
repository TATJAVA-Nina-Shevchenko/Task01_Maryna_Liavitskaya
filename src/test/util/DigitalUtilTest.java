package util;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DigitUtil;

public class DigitalUtilTest {

	@Test(dataProvider = "dpPositiveCheckLength")
	public void testPositiveCheckLength(String[] args, int permissibleLength) {
		assertTrue(args.length == permissibleLength );
	}
	
	@Test(dataProvider = "dpNegativeCheckLength")
	public void testNegativeCheckLength(String[] args, int permissibleLength) {
		assertFalse(args.length == permissibleLength );
	}
	
	@Test(dataProvider = "dpPositiveCheckDigitLength")
	public void testPositiveCheckDigitLength(String arg, int permissibleLength) {
		assertTrue(DigitUtil.checkDigitLength(arg, permissibleLength));
	}
	
	@Test(dataProvider = "dpNegativeCheckDigitLength")
	public void testNegativeCheckDigitLength(String arg, int permissibleLength) {
		assertFalse(DigitUtil.checkDigitLength(arg, permissibleLength) );
	}
	
	@Test(dataProvider = "dpPositiveIsDigit")
	public void testPositiveIsDigit(String arg) {
		assertTrue(DigitUtil.isDigit(arg));
	}
	
	@Test(dataProvider = "dpNegativeIsDigit")
	public void testNegativeIsDigit(String arg) {
		assertFalse(DigitUtil.isDigit(arg) );
	}
	
	@Test(dataProvider = "dpPositiveIsNotZero")
	public void testPositiveIsNotZero(String arg) {
		assertTrue(DigitUtil.isNotZero(arg));
	}
	
	@Test(dataProvider = "dpNegativeIsNotZero")
	public void testNegativeIsNotZero(String arg) {
		assertFalse(DigitUtil.isNotZero(arg) );
	}
	
	@Test(dataProvider = "dpPositiveIsNotZeroSequence")
	public void testPositiveIsNotZeroSequence(String arg) {
		assertTrue(DigitUtil.isNotZeroSequence(arg));
	}
	
	@Test(dataProvider = "dpNegativeIsNotZeroSequence")
	public void testNegativeIsNotZeroSequence(String arg) {
		assertFalse(DigitUtil.isNotZeroSequence(arg) );
	}
	
	@Test(dataProvider = "dpPositiveIsPositive")
	public void testPositiveIsPositive(String arg) {
		assertTrue(DigitUtil.isPositive(arg));
	}
	
	@Test(dataProvider = "dpNegativeIsPositive")
	public void testNegativeIsPositive(String arg) {
		assertFalse(DigitUtil.isPositive(arg) );
	}
	
	@Test(dataProvider = "dpPositiveCheckInsertionPosition")
	public void testPositiveCheckInsertionPosition(int[] arr, int k) {
		assertTrue(DigitUtil.checkInsertionPosition(arr, k));
	}
	
	@Test(dataProvider = "dpNegativeCheckInsertionPosition")
	public void testNegativeCheckInsertionPosition(int[] arr, int k) {
		assertFalse(DigitUtil.checkInsertionPosition(arr, k) );
	}

		
	// ******Data Providers***********
	@DataProvider
	public Object[][] dpPositiveCheckLength() {
		return new Object[][] { 
			new Object[] { new String[] {}, 0}, 
			new Object[] { new String[] {"1"}, 1},
			new Object[] { new String[] {"a"}, 1},
			new Object[] { new String[] {"?"}, 1},
			new Object[] { new String[] {"1", "234"}, 2},
			new Object[] { new String[] {"th", "-1"}, 2}};
	}

	@DataProvider
	public Object[][] dpNegativeCheckLength() {
		return new Object[][] { 
			new Object[] { new String[] {}, 1}, 
			new Object[] { new String[] {"1"}, 0}};
	}
	@DataProvider
	public Object[][] dpPositiveCheckDigitLength() {
		return new Object[][] { 
			new Object[] { "", 0}, 
			new Object[] { "1", 1},
			new Object[] { "a", 1},
			new Object[] { "?", 1},
			new Object[] { "234", 3},
			new Object[] { "-234", 3}, //? bug 
			new Object[] { "-23.4", 3}, //? bug 
			new Object[] {"abcdefgh", 8}};
	}

	@DataProvider
	public Object[][] dpNegativeCheckDigitLength() {
		return new Object[][] { 
			new Object[] { "", 1}, 
			new Object[] { "-234", 4}}; //? bug 
	}

	
	@DataProvider
	public Object[][] dpPositiveIsDigit() {
		return new Object[][] { 
			new Object[] { "1"},
			new Object[] { "234"},
			new Object[] { "-234"}}; 

	}

	@DataProvider
	public Object[][] dpNegativeIsDigit() {
		return new Object[][] { 
			new Object[] { ""}, 
			new Object[] { "-"}, 
			new Object[] { "a"},
			new Object[] { "?"},
			new Object[] { "-23.4"}, 
			new Object[] {"abcdefgh"}};
	}
	
	@DataProvider
	public Object[][] dpPositiveIsNotZero() {
		return new Object[][] { 
			new Object[] { "1"},
			new Object[] { "234"},
			new Object[] { "-234"}}; 

	}

	@DataProvider
	public Object[][] dpNegativeIsNotZero() {
		return new Object[][] { 
			new Object[] { "0"}, 
			new Object[] { "-0"}, 
			new Object[] { "0.00"}, //? bug 
			new Object[] { "?"},//? bug 
			new Object[] {"abcdefgh"}};//? bug 
	}
	
	@DataProvider
	public Object[][] dpPositiveIsNotZeroSequence() {
		return new Object[][] { 
			new Object[] { "10"},
			new Object[] { "01"}, //? expected result
			new Object[] { "-01"},
			new Object[] { "-234"}}; 
	}

	@DataProvider
	public Object[][] dpNegativeIsNotZeroSequence() {
		return new Object[][] { 
			new Object[] { "0"}, //? expected result
			new Object[] { "-0"}, //? expected result
			new Object[] { "0.00"},
			new Object[] { "-00"}, //bug
			new Object[] { "-0.4"}}; //? expected result
		}
	
	@DataProvider
	public Object[][] dpPositiveIsPositive() {
		return new Object[][] { 
			new Object[] { "0"}, 
			new Object[] { "0.4"}
			}; 
	}

	@DataProvider
	public Object[][] dpNegativeIsPositive() {
		return new Object[][] { 
			new Object[] { "-0"},
			new Object[] { "-234"}
		}; 
		}
	
	@DataProvider
	public Object[][] dpPositiveCheckInsertionPosition() {
		return new Object[][] { 
			new Object[] { new int[]{1}, 0},
			new Object[] { new int[]{1, 2 ,3, 4, 5}, 0}, 
			new Object[] { new int[]{1, 2 ,3, 4, 5}, 4}}; 
	}

	@DataProvider
	public Object[][] dpNegativeCheckInsertionPosition() {
		return new Object[][] { 
			new Object[] { new int[]{1}, 2},
			new Object[] { new int[]{1, 2 ,3, 4, 5}, 5}}; 
		}
	
}
