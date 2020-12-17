package Recursion.IndirectRecursion;

import java.util.Scanner;

public class print1toN {
	static int n = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		display1(num);
		sc.close();
	}
	static void display1(int num) {
		if(n<= num) {
			System.out.println(n);
			n++;
			display2(num);
		}
		return;
	}
	static void display2(int num) {
		if(n<= num) {
			System.out.println(n);
			n++;
			display1(num);
		}
		return;
	}
}
