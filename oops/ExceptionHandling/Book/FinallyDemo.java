package oops.ExceptionHandling.Book;

public class FinallyDemo {
	// throw an exception out of the method.
	// just after exception is caught the finally block will execute and then catch
	// block of main
	
	static void fun1() {
		try {
			System.out.println("Inside fun1.");
			throw new RuntimeException("e1");
		} finally {
			System.out.println("fun1 finally.");
		}
	}

	// return from within a try block
	// finally block will execute no matter what
	static void fun2() {
		try {
			System.out.println("Inside fun2.");
			return;
		} finally {
			System.out.println("fun2 finally.");
		}
	}

	// execute a try block normally
	static void fun3() {
		try {
			System.out.println("Inside fun3.");
		} finally {
			System.out.println("fun3 finally.");
		}
	}

	public static void main(String[] args) {
		try {
			fun1();
		} catch (Exception e) {
			System.out.println("Exception Caught!!");
		}
		fun2();
		fun3();
	}

}
