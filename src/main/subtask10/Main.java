package main.subtask10;

import util.DigitUtil;

public class Main {

	public static void main(String[] args) {
		try {
			if (DigitUtil.checkLength(args, 1) && DigitUtil.isDigit(args[0]) && DigitUtil.isPositive(args[0])
					&& DigitUtil.isNotZero(args[0]) && DigitUtil.isNotZeroSequence(args[0])) {

				MatrixFormer matrixFormer = new MatrixFormer();
				int[][] matrix = matrixFormer.formMatrix(Integer.parseInt(args[0]));

				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix.length; j++) {
						System.out.print(matrix[i][j] + " ");
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}