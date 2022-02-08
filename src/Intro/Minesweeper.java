package Intro;

import java.util.Iterator;

public class Minesweeper {
	static int[][] solution(boolean[][] matrix) {
		int[][] r = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int l = 0;
				for (int x=-1;x<=1;x++) {
					for (int y=-1;y<=1;y++) {
						if (x ==0 && y==0) continue;
						if ((0<=i+x && i+x < matrix.length) && (0<=j+y&& j+y < matrix[0].length)) 
							if (matrix[i+x][j+y] == true) l+=1;
					}
				}
				r[i][j]=l;
			}
		}

		return r;
	}

	public static void main(String[] args) {
		boolean[][] matrix = {{true, false, false},
		          	{false, true, false},
		          		{false, false, false}};
		
		int[][] r = solution(matrix);
		for (int i=0;i<r.length;i++) {
			for (int j=0;j<r[0].length;j++) {
				System.out.print(r[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
