package Loops.For_Loop;
import java.util.Scanner;
public class prime_checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number = ");
        int n=sc.nextInt();
        int i;
        boolean isprime=true;
        if(n<=1)
        {
            System.out.println("Error input.Number should be >=2.");
        } else{
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                isprime = false;
                break;
            }
        }
        if(isprime==true)
        {
            System.out.println("Prime Number.");
        } else{
            System.out.println("Not a prime number.");
        }
    }
    }
}