package main.subtask06;

public class Main6 {

	public static void main(String[] args) {
		Main6 m6 = new Main6();

		if (args.length != 3) {
			System.out.println("please enter 3 numbers");
			return;
		}

		int initMin = Integer.parseInt(args[0]);
		int initMax = Integer.parseInt(args[0]);

		int min = m6.findMin(args, initMin);
		int max = m6.findMax(args, initMax);

		System.out.println("Sum is : " + m6.sum(min, max));
	}

	public int findMin(String[] args, int initMin) {
		for (int i = 0; i < args.length; i++) {
			if (Integer.parseInt(args[i]) < initMin) {
				initMin = Integer.parseInt(args[i]);
			}
		}
		return initMin;
	}

	public int findMax(String[] args, int initMax) {
		for (int i = 0; i < args.length; i++) {
			if (Integer.parseInt(args[i]) > initMax) {
				initMax = Integer.parseInt(args[i]);
			}
		}
		return initMax;
	}

	public int sum(int min, int max) {
		return min + max;
	}
}