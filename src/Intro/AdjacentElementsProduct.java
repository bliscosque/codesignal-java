package Intro;

public class AdjacentElementsProduct {

	static int solution(int[] inputArray) {
		int max_prod=inputArray[0]*inputArray[1];
		for (int i=1;i<inputArray.length-1;i++) {
			int prod=inputArray[i]*inputArray[i+1];
			if (prod>max_prod) max_prod=prod;
		}
		return max_prod;
		//mega solucao do colega:
		//return IntStream.range(1, inputArray.length).map(i->inputArray[i]*inputArray[i-1]).max().getAsInt();}
	}
	public static void main(String[] args) {
		int[] mat = {3, 6, -2, -5, 7, 3};
		System.out.println(solution(mat)); //21 3*7	
	}
}
