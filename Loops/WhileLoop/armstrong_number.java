package Loops.WhileLoop;
import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n=sc.nextInt();
        int temp=n;
        int d=0;
        while(temp!=0)
        {
            int r=temp%10;
            d+=r*r*r;
            temp/=10;
        }
        if(d==n)
        System.out.println("Armstrong number.");
        else 
        System.out.println("Not an Armstrong number.");
    }
}