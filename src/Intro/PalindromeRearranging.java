package Intro;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {
	public static void main(String[] args) {
		String inputString = "aabb";
		System.out.println(solution(inputString)); //true
	}
	static boolean solution(String inputString) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch: inputString.toCharArray()) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else map.put(ch, 1);
		}
		int nodd=0;
		for (Map.Entry<Character, Integer> me: map.entrySet()) {
			//System.out.println(me.getKey()+": " + me.getValue());
			if (me.getValue()%2==1) nodd++;
		}
		if (nodd<=1)
			return true;
		return false;
	}

}
