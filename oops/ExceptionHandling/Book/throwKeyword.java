package oops.ExceptionHandling.Book;

public class throwKeyword {

	public static void main(String[] args) {
		try {
			fun1();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage() + " recaught");
		}
	}

	static void fun1() {
		try {
			throw new NullPointerException("null pointer exception.");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage() + " is caught");
			throw e;
		}
	}
}
