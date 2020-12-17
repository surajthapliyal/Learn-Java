package Loops.For_Loop;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size = ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        { 
            for(int j=1;j<=n;j++){
               if(j>=(n+1)-i)
               System.out.print("* ");
               else
               System.out.print(" ");
            }
            System.out.println();
        }
    }
}