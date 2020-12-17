package oops.ExceptionHandling.Book;

public class MultipleCatchClause {

	public static void main(String[] args) {
		try {
			int a=args.length;
			System.out.println("a = "+a);
			int b=42/a;
			int c[] = { 1 };
			c[22] = 99;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("After try/catch block");
	}

}
