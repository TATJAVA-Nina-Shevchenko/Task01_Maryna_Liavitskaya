package main.subtask02;

public class FormulaCalculator {

	double a;
	double b;
	double c;

	public FormulaCalculator(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double calculate() {
		return ((b + (Math.sqrt((Math.pow(b, 2)) + (4 * a * c)))) / (2 * a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
	}

}
