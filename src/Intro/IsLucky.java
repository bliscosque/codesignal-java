package Intro;

public class IsLucky {
	public static void main(String[] args) {
		System.out.println(solution(1230)); //true
		System.out.println(solution(239017)); //false
	}

	static boolean solution(int n) {
		String num = Integer.toString(n);
		String p1=num.substring(0,num.length()/2);
		//System.out.println(p1);
		String p2=num.substring(num.length()/2);
		//System.out.println(p2);
		if (somaChar(p1) == somaChar(p2)) return true;
		return false;
		//segunda solucao
		//String s = Integer.toString(n);
		//return s.substring(0, s.length() / 2).chars().sum() == s.substring(s.length() / 2).chars().sum();
		
	}
	static int somaChar(String s) {
		int soma=0;
		for (char ch: s.toCharArray()) {
			soma+=(ch-'a');
		}
		//System.out.println(soma);
		return soma;
	}
}
