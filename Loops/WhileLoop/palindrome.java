package Loops.WhileLoop;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n=sc.nextInt();
        int temp=n;
        int d=0;
        while(temp!=0)
        {
            int r=temp%10;
            d=d*10+r;
            temp=temp/10;
        }
        System.out.println(d);
        if(d==n) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}