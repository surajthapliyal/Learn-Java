package Recursion;

import java.util.Scanner;

public class sumTillN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter last number = ");
		int n = sc.nextInt();
		int sum = addition(n);
		System.out.println("Sum = "+sum);
		sc.close();
	}
	static int addition(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		else {
			return n+addition(n-1);
		}
	}
}
