package oops.AbstractionAbstractionBook;

abstract class A {

	abstract void callMe(); // abstract method

	void callMeToo() { // concrete method
		System.out.println("This is a concrete method.");
	}
}

class B extends A {

	@Override
	void callMe() {
		System.out.println("B's implementation of Call me.");
	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		B b = new B();
		b.callMe();				//calls overriden method
		b.callMeToo();			//calls concrete method
		
//		A a = new A();		//cannot instantiate A's method as it is an abstract class
	}
}
