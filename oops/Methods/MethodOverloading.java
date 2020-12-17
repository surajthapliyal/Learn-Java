package oops.Methods;
class MethodOverloadDemo {
	
	void test() {
		System.out.println("No arguments.");
	}
	void test(int a,int b) {
		System.out.println("a and b : "+a+" "+b);
	}
	double test(double a) {
		System.out.println("a :"+a );
		return a*a;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloadDemo ob1 = new MethodOverloadDemo();
		ob1.test();
		ob1.test(3,4);
		double result = ob1.test(256.13);
		System.out.println("Result = "+result);
	}

}
