package oops.Interfaces.Book;

public class NestedInterfaceDemo {

	public static void main(String[] args) {
		B b = new B();
		A.NestedInf ref = b;
		
		//or
		//A.NestedInf ref= new B();
		
		boolean isEven = ref.isEven(11);
		System.out.println(isEven);
	}

}
