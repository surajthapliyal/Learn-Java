package oops.Interfaces.Book;

interface A1 {
	
	public void meth1();

	public void meth2();
}

interface B1 extends A1 {
	
	public void meth3();

}

//must implement all inherited methods in interfaces.
class MyClass implements B1 {

	@Override
	public void meth1() {
		System.out.println("Method 1 called.");
	}

	@Override
	public void meth2() {
		System.out.println("Method 2 called.");
	}

	@Override
	public void meth3() {
		System.out.println("Method 3 called.");
	}

}

public class InterfaceInheritance {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		ob.meth1();
		ob.meth2();
		ob.meth3();
	}

}
