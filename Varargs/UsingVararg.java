package Varargs;

public class UsingVararg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaTest(1,2,3,4,5);
		vaTest();
		vaTest(1,2,-1,-2,3+4);
	}
	//vararg method
	static void vaTest(int ... v) {		//inside parameters (int(type) ... v) is used to create vararg
		System.out.println("Length of Vararg = "+v.length);
		for(int each:v) {
			System.out.println(each);
		}
	}

}
