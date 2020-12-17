package questions.gfg;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for (int i = 0; i < tests; i++) {
			int size = sc.nextInt();
			int[] A = new int[size];
			for (int j = 0; j < size; j++) {
				A[j] = sc.nextInt();
			}
			reverseArray(A, size);
			printArray(A, size);
			System.out.println();
		}
		sc.close();
	}

	static void printArray(int A[], int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(A[i] + " ");
		}
	}

	static void reverseArray(int A[], int size) {
		int start = 0, end = size - 1, temp;
		while (start < end) {
			temp = A[start];
			A[start] = A[end];
			A[end] = temp;
			start++;
			end--;
		}
	}
}