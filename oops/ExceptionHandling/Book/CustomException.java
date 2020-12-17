package oops.ExceptionHandling.Book;

class MyException extends Exception {
	private String detail;

	MyException(String a) {
		detail = a;
	}

	public String toString() {
		return "My Exception [" + detail + "]";
	}
	public String getMessage() {
		return detail;
	}
}

public class CustomException {

	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
		} catch (Exception e) {
			System.out.println("Caught " + e.getMessage());
		}finally {
			System.out.println("Finally Block");
		}
		System.out.println("Normal Flow Of Program!!");
	}

	static void compute(int a) throws MyException {
		if (a > 10)
			throw new MyException("Custom Exception!!");
		System.out.println("Normal Exit.");
	}
}
