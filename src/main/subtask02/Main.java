package main.subtask02;

import util.DigitUtil;

public class Main {

	public static void main(String[] args) {
		try {
			if (DigitUtil.checkLength(args, 3) && DigitUtil.isDigit(args[0]) && DigitUtil.isDigit(args[1])
					&& DigitUtil.isDigit(args[2]) && DigitUtil.isNotZeroSequence(args[0])
					&& DigitUtil.isNotZeroSequence(args[1]) && DigitUtil.isNotZeroSequence(args[2])) {

				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				double c = Double.parseDouble(args[2]);

				FormulaCalculator fc = new FormulaCalculator(a, b, c);
				System.out.println("Value of expression : " + fc.calculate());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
