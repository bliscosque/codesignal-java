package Intro;

public class ArrayReplace {
	static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
		int[] ret=inputArray;
		for (int i=0;i<inputArray.length;i++) {
			if (inputArray[i]==elemToReplace)
				inputArray[i]=substitutionElem;
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] inputArray= {1,2,1};
		int[] sol = solution(inputArray, 1, 3);
		for (int i:sol) {
			System.out.print(i + " ");
		}
	}
}
