package main.subtask05;

public class Main5 {

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("please enter 3 numbers");
			return;
		}

		for (int i = 0; i < 3; i++) {
			if (Double.parseDouble(args[i]) < 0) {
				System.out.println(new Main5().involveFour(Double.parseDouble(args[i])));
			} else {
				System.out.println(new Main5().involveTwo(Double.parseDouble(args[i])));
			}
		}
	}

	public double involveTwo(double n) {
		return Math.pow(n, 2);
	}

	public double involveFour(double n) {
		return Math.pow(n, 4);
	}

}
