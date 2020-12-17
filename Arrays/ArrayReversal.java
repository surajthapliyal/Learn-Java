package Arrays;

import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array = ");
        int size=sc.nextInt();
        int[] A=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter element = ");
            A[i]=sc.nextInt();
        }
        System.out.print("Entered array = ");
        printArray(A,size);
        reverseArray(A,size);
        System.out.print("\nReversed array = ");
        printArray(A, size);
        sc.close();
    }
    static void printArray(int A[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    static void reverseArray(int A[],int size)
    {
        int start=0,end=size-1,temp;
        while(start<end)
        {
            temp=A[start];
            A[start]=A[end];
            A[end]=temp;
            start++;
            end--;
        }
    }
}