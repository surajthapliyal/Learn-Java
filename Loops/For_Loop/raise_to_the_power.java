package Loops.For_Loop;
import java.util.Scanner;
public class raise_to_the_power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number = ");
        int a=sc.nextInt();
        System.out.print("Enter power = ");
        int b=sc.nextInt();
        int power=1;
        for(int i=0;i<b;i++)
        {
         power*=a;
        }
        System.out.println("Result = " + power);
    }
}