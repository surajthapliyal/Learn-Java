package oops.NestedClass;

class Outer {
	private int outer_x = 100;

	void test() {
		Inner inner = new Inner(); // Enclosing class does not have any access to the members of the nested class ,
									// so to access them we have to firstly create the object of type inner class
									// then we access them.
		inner.display();
	}

	// this is an Inner class
	class Inner {
		private void display() {
			System.out.println("Display : outer_x = " + outer_x); // nester class can directly access all the members of
																	// its enclosing class even if its private
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.test();
	}

}
