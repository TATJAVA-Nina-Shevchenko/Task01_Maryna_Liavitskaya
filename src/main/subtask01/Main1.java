package main.subtask01;

public class Main1 {

	public static void main(String[] args) {

		if (args.length != 1 || args[0].length() != 4) {
			System.out.println("please enter 4-simbol number");
			return;
		}

		int first = Integer.parseInt(args[0].substring(0, 1));
		int second = Integer.parseInt(args[0].substring(1, 2));
		int third = Integer.parseInt(args[0].substring(2, 3));
		int fourth = Integer.parseInt(args[0].substring(3, 4));

		System.out.println(first + " : " + second + " : " + third + " : " + fourth);

		System.out.println(new Main1().compareSum(first, second, third, fourth));

	}

	public boolean compareSum(int first, int second, int third, int fourth) {
		return (first + second) == (third + fourth);
	}

}
