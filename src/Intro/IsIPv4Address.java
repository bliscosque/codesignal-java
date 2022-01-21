package Intro;

public class IsIPv4Address {
	static boolean solution(String inputString) {
		String[] iS = inputString.split("[.]");
		// System.out.println(iS.length);
		if (iS.length != 4)
			return false;
		try {
			for (String s : iS) {
				if (s.length()>1 && s.charAt(0)=='0') return false;
				// System.out.println(s);
				if (s.equals(""))
					return false;
				int val = Integer.parseInt(s);
				// System.out.println(val);
				if (val < 0 || val > 255)
					return false;
			}
		} catch (Exception e) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(solution("172.16.254.1")); // true
		System.out.println(solution("172.316.254.1")); // false
		System.out.println(solution(".254.255.0")); // false
		System.out.println(solution("1.1.1.1a")); // false
		System.out.println(solution("64.233.161.00"));
	}
}
