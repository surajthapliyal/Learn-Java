package oops.ExceptionHandling.Book;

import java.util.Random;

public class TryANDCatch {

	public static void main(String[] args) {
		int a=0,b=0,c=0;
		Random rand = new Random();
		try {
			a = rand.nextInt();
			b = rand.nextInt();
			c = 12345 / (a/b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " exception occured!");
			c = 0;
		}
		System.out.println("Result = "+c);
	}

}
