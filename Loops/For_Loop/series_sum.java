package Loops.For_Loop;
import java.util.Scanner;
public class series_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit = ");
        int n=sc.nextInt();
        float sum=0;
        for(float i=1;i<=n;i++)
        {
            sum+=(1/i);
        }
        System.out.println("Sum = "+sum);;
    }
}