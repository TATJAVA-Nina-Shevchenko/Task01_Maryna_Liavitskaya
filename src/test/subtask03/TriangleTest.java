package subtask03;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import main.subtask03.Triangle;

public class TriangleTest {
	private static final double delta = 0.001;

	@Test(dataProvider = "dpPositiveHypotrnuse")
	public void testPositiveCalculateHypotenuse(double a, double b, double expectedHypotenuse) {
		Triangle actualTriangle = new Triangle(a, b);
		assertEquals(actualTriangle.calculateHypotenuse(), expectedHypotenuse, delta);
	}

	@Test(dataProvider = "dpPositiveArea")
	public void testPositiveCalculateArea(double a, double b,double expectedArea) {
		Triangle actualTriangle = new Triangle(a, b);
		assertEquals(actualTriangle.calculateArea(), expectedArea, delta);
	}

	@Test(dataProvider = "dpPositivePerimeter")
	public void testPositiveCalculatePerimeter(double a, double b, double expectedPerimeter) {
		Triangle actualTriangle = new Triangle(a, b);
		assertEquals(actualTriangle.calculatePerimeter(), expectedPerimeter, delta);
	}

	// ******Data Providers***********

	@DataProvider
	public Object[][] dpPositiveHypotrnuse() {
		return new Object[][] { 
			new Object[] { 0, 0, 0 }, 
			new Object[] { 1, 2, 2.236 } };
	}

	@DataProvider
	public Object[][] dpPositiveArea() {
		return new Object[][] { 
			new Object[] { 0,0, 0 }, 
			new Object[] {1, 2 , 1 } };
	}

	@DataProvider
	public Object[][] dpPositivePerimeter() {
		return new Object[][] { 
			new Object[] { 0,0, 0 }, 
			new Object[] {1, 2 , 5.236 } }; //?bug : needs depencies in sequence of methods
	}

}
