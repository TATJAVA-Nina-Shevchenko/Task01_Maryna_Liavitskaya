package main.subtask08;

public class MultipleSum {

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
