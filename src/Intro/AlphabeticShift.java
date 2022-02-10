package Intro;

public class AlphabeticShift {
	static String solution(String inputString) {
		String a="";
		for (char ch: inputString.toCharArray()) {
			if (ch=='z') a=a+"a";
			else {
				char chn =(char) (ch+1);
				a=a+chn;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(solution("crazy")); // dsbaz
	}
}
