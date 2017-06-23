package main.subtask04;

import util.DigitUtil;

public class Main {

	public static void main(String[] args) {
		try {
			if (DigitUtil.checkLength(args, 2) && DigitUtil.isDigit(args[0]) && DigitUtil.isDigit(args[1])
					&& DigitUtil.isNotZeroSequence(args[0]) && DigitUtil.isNotZeroSequence(args[1])) {
				GraphicAreaChecker gAreaChecker = new GraphicAreaChecker();
				System.out.println(gAreaChecker.isInGraphicArea(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
