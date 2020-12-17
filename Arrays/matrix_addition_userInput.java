package Arrays;

import java.util.Scanner;

public class matrix_addition_userInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows number = ");
        int rows = sc.nextInt();
        System.out.print("Enter columns number = ");
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] c = new int[rows][cols];
        System.out.println("Enter elements for array 1 :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("Enter "+ i +"," + j +" number = ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENter elements of array 2 :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("Enter "+i+","+j+" number = ");
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(" " + c[i][j] + " ");
            }
            System.out.println();
        }
    }    
}