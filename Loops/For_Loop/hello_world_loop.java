package Loops.For_Loop;
import java.util.Scanner;
public class hello_world_loop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many times to print : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Hello World.");
        }
    }
}