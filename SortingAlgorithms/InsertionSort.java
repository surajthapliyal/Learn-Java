package SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array = ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element = ");
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

	static void sortArray(int arr[], int size) {
		for (int i = 1; i < size; i++) {
			int value = arr[i];
			int hole = i;
			while (hole > 0 && arr[hole - 1] > value) {
				arr[hole] = arr[hole-1];
				hole = hole - 1;
			}
			arr[hole] = value;
		}
	}
}
