package Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByHeight {
	public static void main(String[] args) {
		int[] mat = {-1, 150, 190, 170, -1, -1, 160, 180};
		System.out.println(Arrays.toString(solution(mat)));
	}

	static int[] solution(int[] a) {
		List<Integer> l1 = new ArrayList<Integer>();
		for (int i : a) {
			if (i != -1)
				l1.add(i);
		}
		Collections.sort(l1);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != -1) {
				a[i] = l1.remove(0);
			}
		}
		return a;
	}
	
	//solucao do colega
	//int[] solution(int[] a) {
	//    List<Integer> l = Arrays.stream(a).filter(i->i!=-1).sorted().boxed().collect(Collectors.toList());
	//    List<Integer> m = IntStream.range(0,a.length).map(i->a[i]==-1?i:-1).filter(i->i!=-1).boxed().collect(Collectors.toList());
	//    for (int i=0; i<m.size(); i++) {l.add(m.get(i),-1);}
	//    return l.stream().mapToInt(i->i).toArray();}
}
