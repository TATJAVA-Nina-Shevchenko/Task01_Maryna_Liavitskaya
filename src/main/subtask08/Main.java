package main.subtask08;

import util.DigitUtil;

public class Main {

	static int[] arrNatNum = { 2, 9, 7, 8, 3, 1, 13, 65, 27, 12, 9 };

	public static void main(String[] args) {
		try {
			MultipleSum multipleSum = new MultipleSum();

			if (DigitUtil.checkLength(args, 1) && DigitUtil.isDigit(args[0]) && DigitUtil.isNotZero(args[0])
					&& DigitUtil.isNotZeroSequence(args[0])) {
				int k = Integer.parseInt(args[0]);
				System.out.println("Sum of numbers multiple to K is : " + multipleSum.sumDivisible(arrNatNum, k));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
