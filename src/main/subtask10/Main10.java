package main.subtask10;

public class Main10 {

	static int n;
	static int valueEvenRow;
	static int valueOddRow;

	public static void main(String[] args) {

		if (args.length < 1 || args[0].startsWith("-")) {
			System.out.println("inappropriate input");
			return;
		}

		int n = Integer.parseInt(args[0]);
		valueEvenRow = 1;
		valueOddRow = n;

		int[][] arr = new int[n][n];
		new Main10().formMatrix(n, arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int[][] formMatrix(int n, int[][] arr) {
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