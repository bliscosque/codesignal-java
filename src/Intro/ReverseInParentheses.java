package Intro;

public class ReverseInParentheses {
	public static void main(String[] args) {
		System.out.println(solution("(bar)")); //rab
		System.out.println(solution("foo(bar)baz")); //foorabbaz
		System.out.println(solution("foo(bar)baz(blim)")); //foorabbazmilb
		System.out.println(solution("foo(bar(baz))blim")); //foobazrabblim
	}

	static String solution(String inputString) {
		while (inputString.contains("(")) {
			int mOpen = maxParamOpen(inputString);
			//System.out.println(mOpen);
			inputString = rev(inputString, mOpen);
			//System.out.println(inputString);
		}
		return inputString;
	}

	static int maxParamOpen(String s) {
		int maxParOpen = 0;
		int parOpen = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '(')
				parOpen++;
			if (ch == ')')
				parOpen--;
			if (maxParOpen < parOpen)
				maxParOpen = parOpen;
		}
		return maxParOpen;
	}

	static String rev(String s, int max) {
		int posI = 0;
		int posF = 0;
		int count = 0;
		for (int i = 0; i <= s.length(); i++) {
			if (s.charAt(i) == '(')
				count++;
			if (s.charAt(i) == ')')
				count--;
			if (count == max) {
				posI = i;
				break;
			}
		}
		for (int i = posI; i <= s.length(); i++) {
			if (s.charAt(i) == ')') {
				posF = i;
				break;
			}
		}
		// System.out.println(posI);
		// System.out.println(posF);
		String nova = "";
		nova += s.substring(0, posI);
		// System.out.println(nova);

		StringBuffer sb = new StringBuffer(s.substring(posI + 1, posF));
		sb.reverse();

		// System.out.println("sb: " + sb.toString());

		nova += sb.toString();
		// System.out.println(nova);

		nova += s.substring(posF + 1);
		// System.out.println(nova);
		return nova;
	}
	//solucao do amigo
	//String solution(String inputString) {
	//    StringBuilder str = new StringBuilder(inputString);
	//    int start, end;
	//    while(str.indexOf("(") != -1){
	//        start = str.lastIndexOf("(");
	//        end = str.indexOf(")", start);
	//        str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
	//    }
	//    return str.toString();
	//}
}
