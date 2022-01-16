package Intro;

public class CommonCharacterCount {
	public static void main(String[] args) {
		System.out.println(solution("aabcc", "adcaa"));
	}

	static int solution(String s1, String s2) {
		int[] l1 = new int[26];
		int[] l2 = new int[26];

		for (char ch: s1.toCharArray())
			l1[ch-'a']++;
		for (char ch: s2.toCharArray())
			l2[ch-'a']++;
			
		int sum=0;
		for (int i=0;i<26;i++) {
			sum+=(Math.min(l1[i],l2[i]));
		}
		return sum;
	}

}
