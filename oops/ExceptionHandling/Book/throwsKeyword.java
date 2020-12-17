package oops.ExceptionHandling.Book;

public class throwsKeyword {

	public static void main(String[] args) {
		try {
			fun1();
		} catch (IllegalAccessError e) {
			System.out.println(e.getMessage() + " occured.");
		}
	}

	static void fun1() throws IllegalAccessError{
		System.out.println("Inside fun1");
		throw new IllegalAccessError("Illegal Access Error.");
	}
}
