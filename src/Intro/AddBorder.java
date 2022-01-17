package Intro;

import java.util.Arrays;

public class AddBorder {
	static String[] solution(String[] picture) {
		int nCol=picture[0].length();
		int nLin=picture.length;
		System.out.println(nLin);
		System.out.println(nCol);
		String[] newStr=new String[nLin+2];
		newStr[0]="*";
		for (int i=1;i<nCol+2;i++) {
			newStr[0]+="*";
		}
		for (int i=0;i<nLin;i++) {
			newStr[i+1]="*"+picture[i]+"*";
		}
		newStr[nLin+1]=newStr[0];
		return newStr;
		
		//uma segunda solucao - dos amigos do site...
//		String[] solution(String[] picture) {
//		    String s = "";
//		    ArrayList<String> l = new ArrayList<String>();
//		    for (int i = 0; i < picture[0].length() + 2; i++) {s += "*";}
//		    for (int i = 0; i < picture.length; i++) {l.add("*" + picture[i] + "*");}
//		    l.add(0, s); l.add(s);
//		    return l.toArray(new String[l.size()]);}
	}

	public static void main(String[] args) {
		String[] picture = { "abc", "ded" };
		System.out.println(Arrays.toString(solution(picture)));
	}
}
