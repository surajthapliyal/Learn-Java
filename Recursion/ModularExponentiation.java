package Recursion;

import java.util.Scanner;

public class ModularExponentiation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base number = ");
		int base = sc.nextInt();
		System.out.print("Enter exponentiation number = ");
		int exp = sc.nextInt();
		System.out.print("Enter modular number = ");
		int mod = sc.nextInt();
		int result = modEx(base,exp,mod);
		System.out.println("Result = "+result);
		sc.close();
	}
	static int modEx(int x,int n,int M) {
		if(n <= 0) {
			return 1;
		}else if(n % 2 ==0) {
			int y = modEx(x, n/2, M);
			return (y*y)%M;
		}else {
			return ((x % M)*modEx(x,n-1,M))%M;
		}
	}
}
