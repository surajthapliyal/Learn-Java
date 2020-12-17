package oops.Methods;

class MethodOverloadDemo2 {
	void test() {
		System.out.println("No parameters");
	}

	void test(double a) {
		System.out.println((int) a + " is aumomatic typeCasted to : " + a + "" + " "
						+ "as there is no matching method for int");
	}
	void test(int a,int b) {
		System.out.println("a and b : "+a+" , "+b);
	}
}

public class MethodOverloading_AutotypeCast {

	public static void main(String[] args) {
		MethodOverloadDemo2 ob1 = new MethodOverloadDemo2();
		int i = 88;
		ob1.test();
		ob1.test(i);
		ob1.test(3,4);
	}

}
