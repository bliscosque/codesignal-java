package Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreSimilar {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };
		System.out.println(solution(a, b));
		int[] c = { 1, 2, 3 };
		int[] d = { 2, 1, 3 };
		System.out.println(solution(c, d));
		int[] e = { 1, 2, 2 };
		int[] f = { 2, 1, 1 };
		System.out.println(solution(e, f));
	}

	static boolean solution(int[] a, int[] b) {
		if (Arrays.toString(a).equals(Arrays.toString(b)))
			return true;

		List<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				l.add(i);
			}
		}
		

		if (l.size() == 2) {
			if (a[l.get(0)] == b[l.get(1)] && b[l.get(0)] == a[l.get(1)])
				return true;
		}
		return false;

	}

}
