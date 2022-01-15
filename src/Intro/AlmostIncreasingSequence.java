package Intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		int[] seq = { 1, 3, 2, 1 };
		System.out.println(solution(seq)); // false
		int[] seq2 = { 1, 3, 2 };
		System.out.println(solution(seq2)); // true
	}

	static boolean solution(int[] sequence) {
		if (isOrdered(sequence))
			return true;

		for (int i = 0; i < sequence.length-1; i++) {
			if (sequence[i] >= sequence[i+1]) {
				//try removing next elem
				// int[] -> List<Integer>
				List<Integer> list = Arrays.stream(sequence).boxed().collect(Collectors.toList());
				list.remove(i);
				// List<Integer> -> int[]
				int[] s2 = list.stream().mapToInt(v -> v).toArray();
				if (isOrdered(s2))
					return true;
				//try removing elem+2
				List<Integer> list2 = Arrays.stream(sequence).boxed().collect(Collectors.toList());
				list2.remove(i+1);
				int[] s3 = list2.stream().mapToInt(v -> v).toArray();
				if (isOrdered(s3))
					return true;
			}
		}
		return false;
	}

	static boolean isOrdered(int[] mat) {
		for (int i = 0; i < mat.length - 1; i++) {
			if (mat[i] >= mat[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
