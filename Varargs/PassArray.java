package Varargs;

public class PassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrays to pass:
		int a1[] = {1,2,3,4,5,6,7,8,9};
		int a2[] = {45,34,67,43,23};
		int a3[] = {};
		vaTest(a1);
		vaTest(a2);
		vaTest(a3);
	}
	
	static void vaTest(int[] v) {
		System.out.println("No of args = "+v.length);
		for(int each:v) {
			System.out.println(each);
		}
	}
}
