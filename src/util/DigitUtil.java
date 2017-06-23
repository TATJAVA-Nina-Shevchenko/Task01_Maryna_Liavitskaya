package util;

public class DigitUtil {

	public static boolean checkLength(String[] args, int permissibleLength) {

		if (args.length != permissibleLength) {
			System.out.println("please enter " + permissibleLength + " number");
			return false;
		}
		return true;
	}

	public static boolean checkDigitLength(String arg, int permissibleLength) {

		if (arg.length() != permissibleLength) {
			System.out.println("please enter " + permissibleLength + "-simbol digit");
			return false;
		}
		return true;
	}

	public static boolean isDigit(String arg) {
		try {
			Integer.parseInt(arg);
		} catch (NumberFormatException e) {
			System.out.println("please enter next time digit");
			return false;
		}
		return true;
	}

	public static boolean isNotZero(String arg) {
		if (Integer.parseInt(arg) == 0) {
			System.out.println("please enter not a 0");
			return false;
		}
		return true;
	}

	public static boolean isNotZeroSequence(String arg) {
		if (arg.startsWith("0") && arg.length() > 1) {
			System.out.println("please enter not a 0-sequence");
			return false;
		}
		return true;
	}

	public static boolean isPositive(String arg) {
		if (arg.startsWith("-")) {
			System.out.println("please enter positive number");
			return false;
		}
		return true;
	}

	public static boolean checkInsertionPosition(int[] arr, int k) {
		if (k >= arr.length) {
			System.out.println("wrong insertion position!");
			return false;
		}
		return true;
	}
}
