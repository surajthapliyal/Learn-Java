package questions.hackerRank;

import java.util.Scanner;

public class diagonalDifrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[][] = new int[size][size];
        System.out.println("Enter element for the square matrix : ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int primDiagonal = 0;
        int secDiagonal = 0;
        System.out.println("Entered matrix  : ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(a[i][j] + " ");
                if(a[i] == a[j]) primDiagonal+=a[i][j];
                if(i+j == size-1) secDiagonal+=a[i][j];
            }
            System.out.println();
        }
        
        System.out.println("Diagonal diff = " + Math.abs(primDiagonal-secDiagonal));

    }
}
