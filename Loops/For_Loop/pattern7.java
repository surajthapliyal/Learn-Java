package Loops.For_Loop;
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size = ");
        int n=sc.nextInt();
        int k=0;
        for(int i=1;i<=(n+3);i++)
        { 
            if(i<=n)
            k++;
            else 
            k--;
            for(int j=1;j<=n;j++)
            {
                if(j>=1 && j<=k ){
                    System.out.print("* ");
                    } else {
                    System.out.print(" ");
                }  
            } 
            System.out.println();
        } 
    }
}