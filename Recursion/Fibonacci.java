package Recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n = sc.nextInt();
		int result = recursiveFib(n);
		System.out.println("Fibonacci number at "+n+" place = "+result);
		sc.close();
	}
	static int recursiveFib(int n) {	//this will be slower for larger input
		if(n<=1)  return n;
		return recursiveFib(n-1)+recursiveFib(n-2);
	}
	static int iterativeFib(int n) {	//this will be faster for larger input
		if(n<=1)  return n;
		int f1=0,f2=1,f=0;
		for(int i=2;i<=n;i++) {
			f = f1+f2;
			f1 = f2;
			f2 = f;
		}
		return f;
	}
}
