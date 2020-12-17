package conditional;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a number :");
        a=sc.nextInt();
        if (a%2==0)
        System.out.println("Even number.");
        else
        System.out.println("Odd number.");
    }
}