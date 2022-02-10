package Intro;

public class VariableName {
	static boolean solution(String name) {
		if (name.charAt(0) >='0' && name.charAt(0) <='9') return false;
		if (name.matches("[A-Za-z0-9_]+"))
			return true;
		return false;
	}

	
	public static void main(String[] args) {
		System.out.println(solution("var_1__Int"));//true
		System.out.println(solution("qq-q"));//false
		System.out.println(solution("2w2"));//false
		
	}
}
