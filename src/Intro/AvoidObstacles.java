package Intro;

import java.util.Arrays;

public class AvoidObstacles {
	static int solution(int[] inputArray) {
		Arrays.sort(inputArray);
		//System.out.println(Arrays.toString(inputArray));
		for (int i=1;i<=inputArray[inputArray.length-1];i++) {
			boolean test=true;
			for (int j:inputArray) {
				if (j%i==0) test=false;
			}
			if (test==true) return i;
		}
		return inputArray[inputArray.length-1]+1;
	}

	public static void main(String[] args) {
		int[] inputArray = {5, 3, 6, 7, 9};
		System.out.println(solution(inputArray));
	}
}
