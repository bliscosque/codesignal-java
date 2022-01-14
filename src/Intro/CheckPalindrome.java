package Intro;

public class CheckPalindrome {

	static boolean solution(String inputString) {
		StringBuffer sb = new StringBuffer(inputString);
		sb.reverse();
		if (inputString.equals(sb.toString())) return true;
		return false;
		//return new StringBuilder(s).reverse().toString().equals(s); #amazing solution from a colleague
	}

	public static void main(String[] args) {
		String inputString = "aabaa";
		System.out.println(solution(inputString)); //true
		 inputString = "abac";
		System.out.println(solution(inputString)); //false
		 inputString = "a";
		System.out.println(solution(inputString)); //true
	}

}
