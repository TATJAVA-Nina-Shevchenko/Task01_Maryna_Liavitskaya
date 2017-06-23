package main.subtask01;

import util.DigitUtil;

public class Main {

	public static void main(String[] args) {
		try {
			if (DigitUtil.checkLength(args, 1) && DigitUtil.isDigit(args[0]) && DigitUtil.isPositive(args[0])
					&& DigitUtil.checkDigitLength(args[0], 4) && DigitUtil.isNotZeroSequence(args[0])) {

				int firstDigit = Integer.parseInt(args[0].substring(0, 1));
				int secondDigit = Integer.parseInt(args[0].substring(1, 2));
				int thirdDigit = Integer.parseInt(args[0].substring(2, 3));
				int fourthDigit = Integer.parseInt(args[0].substring(3, 4));

				FourDigitNumber fourDigitNumber = new FourDigitNumber(firstDigit, secondDigit, thirdDigit, fourthDigit);
				System.out.println(
						"The sum of the first two digits of a given four-digit number is equal to the sum of its last two digits : "
								+ fourDigitNumber.compareSum());
			}
		} catch (Exception e) {
			
		}
	}
}
