package main.subtask02;

public class Main2 {
	static double result = 0;

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("please enter 4 arguments number");
			return;
		}

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);		

		System.out.println(new Main2().calculate(a, b, c));

	}

	public double calculate(double a, double b, double c) {
		return ((b + (Math.sqrt((Math.pow(b, 2)) + (4 * a * c)))) / (2 * a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
	}

}
