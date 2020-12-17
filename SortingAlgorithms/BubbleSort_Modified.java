package SortingAlgorithms;

import java.util.Scanner;

//best case = O(n)
//average case = O(n^2)
//worst case = O(n^2)
public class BubbleSort_Modified {

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
		for (int pass = 1; pass < size; pass++) {// total pass to sort array will always be size-1
			boolean flag = false;
			System.out.println(pass);
			for (int i = 0; i < size - pass; i++) {// as the half part will get sorted with greater element
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i]; // swap a[i] with a[i+1] if it is greater
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag = true;
				}
			}
			if (flag == false)
				break; // false flag means no more sorting is occured so we will break form the loop
		}
	}
}
