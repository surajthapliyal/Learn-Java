package oops.Interfaces.Book;

interface myinterface {
	public void name();

	private void getAge() { // cannot be inherited , must be implemented and can be called by only default
							// methods and other private methods in the same class they are defined in.
		System.out.println("My age = 20");
	}

	default void DgetAge() {
		getAge();
	}
}

interface myinterface2 extends myinterface {
		//here private methods are not inherited only default and abs methods are inherited.
}

public class PrivateInterfaceMethod implements myinterface2 {

	public static void main(String[] args) {
		PrivateInterfaceMethod obj = new PrivateInterfaceMethod();
		obj.name();
		obj.DgetAge();
	}

	@Override
	public void name() {
		System.out.println("My name is Suraj Thapliyal.");
	}

}
