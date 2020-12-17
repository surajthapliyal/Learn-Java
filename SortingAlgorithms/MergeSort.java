package SortingAlgorithms;
import java.util.Scanner;

public class MergeSort {
    void mergeSort(int arr[]) {
        int n = arr.length;
        if (n < 2) { // base condition for recursion
            return; // array with one element is already sorted.
        }
        int mid = n / 2;
        int left[] = new int[mid]; // create left half subarray
        int right[] = new int[n - mid]; // create right half subarray

        // filling both subarrays with elements :

        for (int i = 0; i < mid - 1; i++) {
            left[i] = arr[i]; // filling left array
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i]; // filling right array
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    void merge(int left[], int right[], int arr[]) {
        int leftSize = left.length;
        int rightSize = right.length;
        int l = 0; // pointer for left array
        int r = 0; // pointer for right array
        int a = 0; // pointer for actual array

        // overwriting the elements in sorted way in actual array
        while (l < leftSize && r < rightSize) { // while index for left and right are valid
            if (left[l] < right[r]) {
                arr[a] = left[l];
                l++;
                a++;
            }
            if (right[r] < left[l]) {
                arr[a] = right[r];
                r++;
                a++;
            }
        }

        // if any of the elements are remaining in the left array
        while (l < leftSize) { // while index for left array is valid
            arr[a] = left[l]; // then overwrite
            l++;
            a++;
        }

        // if any of the elements are remaining in the right array
        while (r < rightSize) { // while index for right array is valid
            arr[a] = right[r]; // then overwrite
            r++;
            a++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEntered array = ");
        printArray(arr);
        MergeSort ob = new MergeSort();
        ob.mergeSort(arr);
        System.out.print("\nSorted array = ");
        printArray(arr);
        sc.close();
    }
    static void printArray(int arr[]){
        for(int each : arr){
            System.out.print(each + "  ");
        }
    }
}
