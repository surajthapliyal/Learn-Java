package Recursion;

import java.util.Scanner;

public class sumOfArray {
	static int sum=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array = ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter elements to be entered in the array : ");
		for(int i=0;i<size;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array entered : ");
		int s = addition(a,0);
		System.out.println("Sum of array = "+s);
		sc.close();
	}
	static int addition(int a[],int index) {
		if(index == -1)
			return 0;
		if(index == a.length) {
			return sum;
		}
		else {	
			sum += a[index];
			return addition(a,index+1);
		}
	}
}
