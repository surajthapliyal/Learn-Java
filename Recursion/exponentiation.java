package Recursion;

import java.util.Scanner;

public class exponentiation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a base number = ");
		int base = sc.nextInt();
		System.out.print("Enter exponentiation number = ");
		int exp = sc.nextInt();
		int result = pow(base, exp);
		System.out.print("Result = " + result);
		sc.close();
	}

	static int pow(int x, int n) {
		if (n <= 0) {
			return 1;
		} 
		else if(n % 2 == 0){
			int y = pow(x,n/2);
			return y*y;
		}
		else {
		return x * pow(x, n - 1);
	}
	}
}
