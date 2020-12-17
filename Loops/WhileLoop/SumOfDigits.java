package Loops.WhileLoop;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.print("Sum = "+sum);

    }
}