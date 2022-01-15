package Intro;

public class MatrixElementsSum {
	static int solution(int[][] matrix) {
		int linS = matrix.length;
		int colS = matrix[0].length;
		int soma = 0;
		for (int j = 0; j < colS; j++) {
			for (int i = 0; i < linS; i++) {
				soma += matrix[i][j];
				if (matrix[i][j] == 0)
					break;
//				System.out.println(matrix[i][j]);
			}
		}
		return soma;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 1, 2 }, { 0, 5, 0, 0 }, { 2, 0, 3, 3 } };
		System.out.println(solution(matrix));
		int[][] matrix2 = { { 1, 1, 1, 0 }, { 0, 5, 0, 1 }, { 2, 1, 3, 10 } };
		System.out.println(solution(matrix2));

	}

}
