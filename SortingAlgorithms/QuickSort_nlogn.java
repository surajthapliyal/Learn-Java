package SortingAlgorithms;

import java.util.Scanner;

public class QuickSort_nlogn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered array = ");
        printArray(arr);
        quickSort(arr,0,size-1);
        System.out.print("\nSorted array = ");
        printArray(arr);
        sc.close();
    }
    static void printArray(int arr[]){
        for(int each : arr){
            System.out.print(each + "  ");
        }
    }
    static void quickSort(int arr[],int start,int end){
        if(start >= end){   //if invalid index or only one element in the assumed subarray 
            return; 
        }
        int pivotIndex = partition(arr, start, end); // return pivot's index after rearrangement
        //(element less than pivot on left side of it and greater than pivot on right side of it)

        quickSort(arr, start, pivotIndex-1);    //quicksort on pivot left side
        quickSort(arr, pivotIndex+1, end);      //quicksort on pivot right side
    }
    static int partition(int arr[],int start,int end){
        // let pivot be last element on assumed subarray
        int pivot = arr[end];
        int pIndex = start;
        for(int i=start;i<end;i++){
            if(arr[i] < pivot){ //if less than pivot then swap
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        int temp = arr[end];  // at last, swap pivot
        arr[end] = arr[pIndex];
        arr[pIndex] = temp; 
        return pIndex;      //return index of pivot
    }
}
