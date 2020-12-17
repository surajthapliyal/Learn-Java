package Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n = sc.nextInt();
		int ans = fact(n);
		System.out.println("Factorial = " + ans);
		sc.close();
	}

	static int fact(int n) {
		System.out.println("Calculating F("+n+")");
		if (n == 0)	return 1;
		int F = n * fact(n - 1);
		System.out.println("Done F("+n+") = "+F);
		return F;
	}
}
