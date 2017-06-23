package main.subtask05;

import util.DigitUtil;

public class Main {

	public static void main(String[] args) {
		try {
			if (DigitUtil.checkLength(args, 3) && DigitUtil.isDigit(args[0]) && DigitUtil.isDigit(args[1])
					&& DigitUtil.isDigit(args[2]) && DigitUtil.isNotZeroSequence(args[0])
					&& DigitUtil.isNotZeroSequence(args[1]) && DigitUtil.isNotZeroSequence(args[2])) {

				PowerInvolver pInvolver = new PowerInvolver();

				for (int i = 0; i < 3; i++) {
					if (Double.parseDouble(args[i]) < 0) {
						System.out.println(
								"Result of exponentiation 4 : " + pInvolver.involveFour(Double.parseDouble(args[i])));
					} else {
						System.out.println(
								"Result of exponentiation 2 : " + pInvolver.involveTwo(Double.parseDouble(args[i])));
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
