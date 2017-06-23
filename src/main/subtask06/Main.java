package main.subtask06;

import util.DigitUtil;

public class Main {

	public static void main(String[] args) {
		try {
			if (DigitUtil.checkLength(args, 3) && DigitUtil.isDigit(args[0]) && DigitUtil.isDigit(args[1])
					&& DigitUtil.isDigit(args[2]) && DigitUtil.isNotZeroSequence(args[0])
					&& DigitUtil.isNotZeroSequence(args[1]) && DigitUtil.isNotZeroSequence(args[2])) {

				NumberManipulator numberManipulator = new NumberManipulator();

				int initMin = Integer.parseInt(args[0]);
				int initMax = Integer.parseInt(args[0]);

				int min = numberManipulator.findMin(args, initMin);
				int max = numberManipulator.findMax(args, initMax);

				System.out.println("Sum is : " + numberManipulator.sum(min, max));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}