package Intro;

public class ArrayChange {
	public static void main(String[] args) {
		int[] inputArray= {1,1,1};
		System.out.println(solution(inputArray));
	}
	static int solution(int[] inputArray) {
		int move=0;
		int last=inputArray[0];
		for (int i=1;i<inputArray.length;i++) {
			if (inputArray[i] <= last ) {
				move+=last-inputArray[i]+1;
				//System.out.println(move);
				last=last+1;
				//System.out.println(last);
			}
			else last=inputArray[i];
		}
		return move;
	}

}
