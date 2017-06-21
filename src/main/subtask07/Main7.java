package main.subtask07;

public class Main7 {

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("please enter 3 arguments : segment begin, segment end, step");
			return;
		}

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double h = Double.parseDouble(args[2]);

		System.out.println(" attribute | values of a function");
		System.out.println("--------------------------------");

		
		for (double x = a; x <= b; x += h) {
			System.out.println("    " + x + "    | " + new Main7().calculatedFunction(x));
		}
	}

	public double calculatedFunction(double x) {		
		return (Math.pow(Math.sin(x), 2) - Math.cos(2 * x));
	}

}
