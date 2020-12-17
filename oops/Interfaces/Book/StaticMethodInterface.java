package oops.Interfaces.Book;
interface myIntf{
	int getNumber();
	
	default String getString() {
		return "STRING RETURNED";
	}
	
	static int getDefaultNumber() {
		return 100;
	}
}
public class StaticMethodInterface {

	public static void main(String[] args) {
		//to call Static method of interface:
		int defaultNumber = myIntf.getDefaultNumber();
		System.out.println("Default number of Interface = "+defaultNumber);
	}

}
