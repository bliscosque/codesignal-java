package Intro;

public class CenturyFromYear {
	static int solution(int year) {
		int dir=year%100;
		int esq=year/100;
		if (dir>0) return esq+1;
		else return esq;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(1905)); //20
		System.out.println(solution(1700)); //17	
		System.out.println(solution(2001)); //21	
	}
}
