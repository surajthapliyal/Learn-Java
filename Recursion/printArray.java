package Recursion;

import java.util.Scanner;

public class printArray {

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
		display(a,0);
		sc.close();
	}
	static void display(int a[],int index) {
		if(index == -1)
			return;
		if(index == a.length)
			return;
		else {
			System.out.print(a[index] + "  ");
			display(a,index+1);
		}
	}
}
