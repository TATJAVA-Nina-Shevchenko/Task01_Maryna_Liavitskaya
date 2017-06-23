package main.subtask09;

import util.DigitUtil;

public class Main {

	static int[] arrFirst = { 2, 9, 5, 7, 8 };
	static int[] arrSecond = { 12, 15, 65, 27 };
	static int[] arrResult;

	public static void main(String[] args) {
		try {
			if (DigitUtil.checkLength(args, 1) && DigitUtil.isDigit(args[0]) && DigitUtil.isPositive(args[0])
					&& DigitUtil.checkInsertionPosition(arrFirst, Integer.parseInt(args[0]))
					&& DigitUtil.isNotZeroSequence(args[0])) {

				arrResult = new int[arrFirst.length + arrSecond.length];

				ArrayMerger arrayMerger = new ArrayMerger();
				arrayMerger.merge(Integer.parseInt(args[0]), arrResult, arrFirst, arrSecond);

				for (int i = 0; i < arrResult.length; i++) {
					System.out.print(arrResult[i] + " ");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
