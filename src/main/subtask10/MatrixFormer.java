package main.subtask10;

public class MatrixFormer {

	public int[][] formMatrix(int n) {
		
		int[][] arr = new int[n][n];
		int valueEvenRow = 1;
		int valueOddRow = n;
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = valueEvenRow;
					valueEvenRow++;
				}
				valueEvenRow = 1;
			} else {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = valueOddRow;
					valueOddRow--;
				}
				valueOddRow = n;
			}
		}
		return arr;
	}
}
