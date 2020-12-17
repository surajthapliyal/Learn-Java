package oops.ExceptionHandling.Video;

import java.util.Scanner;

public class ThrowsAndThrowExample {

	public static void main(String[] args) {
		fun1();
	}

	static void fun1() throws ArithmeticException {
		Scanner sc = new Scanner(System.in);
		int a[] = { 23,5,76,42,76,89,53,23,46,678,76};
		for(int each:a) {
			System.out.print(each+"  ");
		}
		try {
			System.out.println("\nEnter the num (1 - size)= ");
			int num = sc.nextInt();
			if (num > a.length || num <= 0) {
				throw new ArithmeticException("Incorrect number entered in the array.");
			}
			for (int i = 0; i < a.length; i++) {
				if (i == num - 1) {
					System.out.println("Number = " + a[i]);
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
