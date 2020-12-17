package Varargs;

public class OverloadingVararg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaTest(1,2,3,4,5);
		vaTest(true,false,false,true);
		vaTest("String array : ","hello","my","name","is","Suraj","Thapliyal");
	}

	static void vaTest(int... v) {
		System.out.println("Length = " + v.length);
		for(int each: v) {
			System.out.println(each);
		}
	}

	static void vaTest(boolean... v) {
		System.out.println("Length = " + v.length);
		for(boolean b : v) {
			System.out.println(b);
		}
	}
	static void vaTest(String msg , String ... v) {
		System.out.println("Length = " + v.length);
		System.out.println("Message = "+msg);
		for(String s : v) {
			System.out.println(s);
		}
	}
}
