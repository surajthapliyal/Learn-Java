package Loops.For_Loop;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter whose factorial you want : ");
        int n=sc.nextInt();
        int prod=1;
        for(int i=n;i>=1;i--)
        {
         prod*=i;
        }
        System.out.println(prod);
    }
}