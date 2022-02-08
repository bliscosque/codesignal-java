package Intro;

public class EvenDigitsOnly {
	static boolean solution(int n) {
		while (n>0) {
			int a=n%10;
			if (a%2==1) return false;
			n=n/10;
		}
		return true;
	}
	public static void main(String[] args) {
		int n = 248622;
		System.out.println(solution(n)); //true
		n=642386;
		System.out.println(solution(n)); //false
	}

}
