package Intro;

public class ArrayMaximalAdjacentDifference {
	static int solution(int[] inputArray) {
		int max=Math.abs(inputArray[0]-inputArray[1]);
		for (int i=1;i<inputArray.length;i++) {
			max=Math.max(max, Math.abs(inputArray[i]-inputArray[i-1]));
		}
				
		return max;
	}

	public static void main(String[] args) {
		int[] inputArray={2,4,1,0};
		System.out.println(solution(inputArray));
	}
}
