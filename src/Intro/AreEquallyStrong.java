package Intro;

public class AreEquallyStrong {
	static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

	    if (Math.max(yourRight, yourLeft) == Math.max(friendsLeft, friendsRight))
	        if (Math.min(yourRight, yourLeft) == Math.min(friendsLeft, friendsRight))
	            return true;

	    return false;
	}
	public static void main(String[] args) {
		System.out.println(solution(10,15,15,10)); // true
		System.out.println(solution(15,10,15,10)); //true
		System.out.println(solution(15,10,15,9)); //false
	}
}
