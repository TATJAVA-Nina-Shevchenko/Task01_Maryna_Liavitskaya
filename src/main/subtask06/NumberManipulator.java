package main.subtask06;

public class NumberManipulator {

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
