package Loops.For_Loop;
import java.util.Scanner;
public class n_Even_numbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit : ");
        int n=sc.nextInt();
        System.out.println("\nEven numbers are : ");
        for(int i=0;i<=n;i+=2)
        {
            System.out.println(i);
        }
    }
}