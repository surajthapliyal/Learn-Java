package oops.Polymorphism;

class A11 {
	void show() {
		System.out.println("Inside A's show method.");
	}
}

class B11 extends A11 {
	void show() {
		System.out.println("Inside B's show method.");
	}
}

class C11 extends B11 {
	void show() {
		System.out.println("Inside C's show method.");
	}
}

public class DynamicMethodDipatch {

	public static void main(String[] args) {
		A11 a = new A11(); // object of A
		B11 b = new B11(); // object of B
		C11 c = new C11(); // object of C

		A11 ref; // refrence variable;
		ref = a; // referring to a
		ref.show();

		ref = b;
		ref.show();

		ref = c;
		ref.show();
	}

}
