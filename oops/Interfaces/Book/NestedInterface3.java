package oops.Interfaces.Book;

class lolClass1 {
	interface lolInterface {
		public void infMethof();
	}

	void lol1Method() {
		System.out.println("Class 1 method is called.");
	}
}

class lolClass2 implements lolClass1.lolInterface {

	@Override
	public void infMethof() {
		System.out.println("Interface method is called.");
	}

	void lol2Method() {
		System.out.println("Class 2 method is called.");
	}
}

public class NestedInterface3 {

	public static void main(String[] args) {
		lolClass1 obj1 = new lolClass1();
		obj1.lol1Method();

		lolClass2 obj2 = new lolClass2();
		obj2.lol2Method();

		lolClass1.lolInterface ref = obj2;
		ref.infMethof();
	}

}
