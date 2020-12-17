package oops.Inheritance.InheritanceBook;

class A1 {
	int i;
}

class B1 extends A1 {
	int i;

	B1(int A, int B) {
		super.i = A;
		i = B;
	}

	void showdata() {
		System.out.println("i in super class = " + super.i);
		System.out.println("i in sub class = " + i);
	}
}

public class SuperKeywordMethods {

	public static void main(String[] args) {
		B1 obj = new B1(1, 2);
		obj.showdata();
	}

}
