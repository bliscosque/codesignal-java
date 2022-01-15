package Intro;

public class ShapeArea {
	static int solution(int n) {
		int[] mat = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			if (i <= 1)
				mat[i] = i;
			else
				mat[i] = mat[i - 1] + 4 * (i - 1);
			// System.out.println(mat[i]);
		}
		return mat[n];

		// solucao do colega --recursao
		// if(n == 1) return 1;
		// return 4*(n-1) + solution(n-1);

		// OPC2
		// return (n*n)+( (n-1)*(n-1) );
	}

	public static void main(String[] args) {
		int n = 2;
		System.out.println(solution(n)); // 5
		n = 3;
		System.out.println(solution(n)); // 13
	}
}
