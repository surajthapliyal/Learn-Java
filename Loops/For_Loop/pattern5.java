package Loops.For_Loop;
import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size = ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=n-i)
                System.out.print("  ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}