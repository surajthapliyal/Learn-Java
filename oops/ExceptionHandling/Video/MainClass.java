package oops.ExceptionHandling.Video;

public class MainClass {
	public static void main(String[] args) {
		try {
			int a = 5;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()+" occured , please check your code!");
		}
		System.out.println("Very important Code !! \nNeeds to Run.");
	}
}