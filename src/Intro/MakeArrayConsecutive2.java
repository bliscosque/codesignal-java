package Intro;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
	static int solution(int[] statues) {
		Arrays.sort(statues);
		return statues[statues.length-1]-statues[0]-statues.length+1;
	}
	public static void main(String[] args) {
		int[] statues = {6, 2, 3, 8};
		System.out.println(solution(statues)); //3 (4, 5, 7)
	}
}
