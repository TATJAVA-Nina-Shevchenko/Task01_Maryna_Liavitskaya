package main.subtask09;

public class ArrayMerger {

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
