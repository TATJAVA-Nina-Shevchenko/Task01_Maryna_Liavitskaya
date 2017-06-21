package main.subtask09;

public class Main9 {

	static int[] arrFirst1 = { 2, 9, 5, 7, 8 };
	static int[] arrSecond1 = { 12, 15, 65, 27 };

	public static void main(String[] args) {

		int k = Integer.parseInt(args[0]);

		if (k >= arrFirst1.length) {
			System.out.println("wrong insertion position!");
			return;
		}

		int initialSize = arrFirst1.length + arrSecond1.length;
		int[] arrResult = new int[initialSize];

		new Main9().merge(k, arrResult, arrFirst1, arrSecond1);

		for (int i = 0; i < arrResult.length; i++) {
			System.out.print(arrResult[i] + " ");
		}
	}

	public int[] merge(int k, int[] arr, int[] arrFirst, int[] arrSecond) {
		if (k < arrFirst.length) {
			for (int i = 0; i < arrFirst.length; i++) {
				if (i < k) {
					arr[i] = arrFirst[i];
				} else if (i >= k) {
					for (int j = 0; j < arrSecond.length; j++) {
						arr[i + j] = arrSecond[j];
					}
					break;
				}
			}

			for (int i = 0; i < arrFirst.length - k; i++) {
				arr[k + arrSecond.length + i] = arrFirst[k + i];
			}
		}
		return arr;
	}
}
