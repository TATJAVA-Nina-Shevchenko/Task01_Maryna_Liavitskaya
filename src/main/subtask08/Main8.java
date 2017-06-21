package main.subtask08;

public class Main8 {

	static int[] arrNatNum = { 2, 9, 7, 8, 3, 1, 13, 65, 27, 12, 9 };

	public static void main(String[] args) {

		int k = Integer.parseInt(args[0]);

		System.out.println("Sum of numbers multiple to K is : " + new Main8().sumDivisible(arrNatNum, k));
	}

	public int sumDivisible(int[] arrNatNum, int k) {
		int sum = 0;
		for (int i = 0; i < arrNatNum.length; i++) {
			if (arrNatNum[i] % k == 0) {
				sum += arrNatNum[i];
			}
		}
		return sum;
	}
}
