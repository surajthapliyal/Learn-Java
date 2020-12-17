package Loops.For_Loop;
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number whose table you want to print : ");
        int n=sc.nextInt();
        int sum=0,i;
        System.out.println("\nTable : \n");
        for(i=0;i<10;i++)
        {
            sum+=n;
            System.out.println(sum);
        }
    }
}