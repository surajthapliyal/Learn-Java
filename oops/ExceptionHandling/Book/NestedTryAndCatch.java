package oops.ExceptionHandling.Book;

public class NestedTryAndCatch {

	public static void main(String[] args) {
		try {
			int a = args.length;
			int b = 42 / a;
			System.out.println("a = " + a);
			try {
				if (a == 1)
					a = a / (a - a);
				if (a == 2) {
					int c[] = { 1 };
					c[42] = 99;
				}
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Array index out of bound: " + e2);
			}
		} catch (ArithmeticException e) {
			System.out.println("Divided by 0 = " + e);
		}
	}
}
