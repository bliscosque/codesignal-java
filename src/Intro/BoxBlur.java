package Intro;

import java.util.Arrays;

public class BoxBlur {
	public static void main(String[] args) {
		int[][] image1 = { { 1, 1, 1 }, { 1, 7, 1 }, { 1, 1, 1 } };
		int[][] res = solution(image1);

		for (int i=0;i<res.length;i++) {
			for (int j=0;j<res[0].length;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
		int[][] image2 = { { 7, 4, 0, 1 }, { 5, 6, 2, 2 }, { 6, 10, 7, 8 }, { 1, 4, 2, 0 } };
		int[][] res2 = solution(image2);

		for (int i=0;i<res2.length;i++) {
			for (int j=0;j<res2[0].length;j++) {
				System.out.print(res2[i][j]);
			}
			System.out.println();
		}

	}

	static int[][] solution(int[][] image) {
		int lin = image.length;
		int col = image[0].length;
		int[][] ret = new int[lin - 2][col - 2];

		for (int i = 0; i < lin - 2; i++) {
			for (int j = 0; j < col - 2; j++) {
				int sum = 0;
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						//System.out.println(i + " " + j + " " + k + " " + l);
						sum += image[i + k][j + l];
					}

				}
				ret[i][j] = (sum / 9);
			}
		}

		return ret;

	}

}
