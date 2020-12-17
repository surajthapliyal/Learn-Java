package Varargs;

public class UsingVarargWIthNormalParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaTest("First Vararg with ", 1,2,3,4,5,6,7,8,9);
		vaTest("Second Vararg with ", 2,3,6,3,27,5);
	}
	static void vaTest(String msg,int ... v) {
		System.out.println(msg + v.length + " length : ");
		for(int x : v) {
			System.out.println(x);
		}
	}
}
