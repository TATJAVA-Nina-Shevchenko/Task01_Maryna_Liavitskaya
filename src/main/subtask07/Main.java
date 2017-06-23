package main.subtask07;

import util.DigitUtil;

public class Main {

	public static void main(String[] args) {
		try {
			if (DigitUtil.checkLength(args, 3) && DigitUtil.isDigit(args[0]) && DigitUtil.isDigit(args[1])
					&& DigitUtil.isDigit(args[2]) && DigitUtil.isPositive(args[1]) && DigitUtil.isPositive(args[2])
					&& DigitUtil.isNotZero(args[1]) && DigitUtil.isNotZero(args[2])
					&& DigitUtil.isNotZeroSequence(args[0]) && DigitUtil.isNotZeroSequence(args[1])
					&& DigitUtil.isNotZeroSequence(args[2])) {

				FunctionCalculator functionCalculator = new FunctionCalculator();
				System.out.println(" attribute | values of a function");
				System.out.println("--------------------------------");

				double a = Double.parseDouble(args[0]); // вот где это делать ??
				double b = Double.parseDouble(args[1]);
				double h = Double.parseDouble(args[2]);
				for (double x = a; x <= b; x += h) {
					System.out.println("    " + x + "    | " + functionCalculator.calculatedFunction(x));
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
