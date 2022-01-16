package Intro;

import java.util.Arrays;

public class AlternatingSums {
	public static void main(String[] args) {
		int[] a = {50, 60, 60, 45, 70};
		System.out.println(Arrays.toString(solution(a)));
	}
	
	static int[] solution(int[] a) {
		int[] sol=new int[2];
		for (int i=0;i<a.length;i++) {
			sol[i%2]+=a[i];
		}
		return sol;
	}
	//usando funcional (codigo colega)
	//    return new int[] {IntStream.range(0,a.length).map(i->i%2==0?a[i]:0).sum(), 
	//                      IntStream.range(0,a.length).map(i->i%2==1?a[i]:0).sum()};}
}
