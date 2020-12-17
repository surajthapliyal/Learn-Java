package SortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array = ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter element = ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Entered array = ");
		printArray(arr, size);
		System.out.println();
		sortArray(arr, size);
		System.out.print("Sorted array = ");
		printArray(arr, size);
		sc.close();
	}

	static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void sortArray(int a[], int size) {
		for(int i=1;i<size;i++){
			int current = a[i];
			int j=i-1;
			while(j>=0 && a[j]>current){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = current;
		}
	}
}
