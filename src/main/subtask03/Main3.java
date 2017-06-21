package main.subtask03;

public class Main3 {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("please enter 2 numbers");
			return;
		}

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);

		System.out.println("Area of a triangle : " + new Main3().calculateArea(a, b));

		double c = new Main3().calculateHypotenuse(a, b);
		System.out.println("Triangle perimeter with cathetus " + a + " & " + b + " & hypotenuse " + c + " is : "
				+ new Main3().calculatePerimeter(a, b, c));

	}

	public double calculateArea(double a, double b) {
		return (a * b) / 2;
	}

	public double calculateHypotenuse(double a, double b) {
		return Math.sqrt(a * a + b * b);
	}

	public double calculatePerimeter(double a, double b, double c) {
		return (a + b + c);
	}
}
