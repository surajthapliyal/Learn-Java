package oops.ExceptionHandling.Book;

import java.util.Scanner;

public class BankExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter total amount present in the Bank = ");
		int totalAmount = sc.nextInt();
		System.out.print("Enter amount to be withdrawn = ");
		int withdrawalAmount = sc.nextInt();
		try {
			if(totalAmount < withdrawalAmount) {
				throw new ArithmeticException("Wrong Input!!!");
			}
			else {
				System.out.println("Amount left = " +(totalAmount - withdrawalAmount));
			}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
