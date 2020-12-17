package Loops.WhileLoop;
import java.util.Scanner;
public class numberOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number  = ");
        int n=sc.nextInt();
        int total=0;
        while(n!=0)
        {
            int r=n%10;
            if(r>=0)
            total++;
            n=n/10;
        }
        System.out.print(total);
    }
}