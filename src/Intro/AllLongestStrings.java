package Intro;

import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings {
	public static void main(String[] args) {
		String[] inputArray = { "aba", "aa", "ad", "vcd", "aba" };
		String[] ret = solution(inputArray);
		for (String s : ret)
			System.out.println(s);

	}

	static String[] solution(String[] inputArray) {
		int max = inputArray[0].length();
		for (String s : inputArray)
			if (s.length() > max)
				max = s.length();
		//System.out.println(max);
		List<String> l = new ArrayList<>();
		for (String s : inputArray)
			if (s.length() == max)
				l.add(s);
		String[] ret = l.toArray(new String[0]);
		return ret;
		
		//fazendo uma segunda parte mais interessante - programacao funcional para filtrar matriz
	    //return Stream.of(inputArray)
	    //        .filter(s -> s.length() == longestLength)
	    //        .toArray(String[]::new);
	}

}
