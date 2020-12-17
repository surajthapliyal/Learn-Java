package conditional;
import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a , b , max ;
        System.out.println("Enter the value of A :");
        a=sc.nextInt();
        System.out.println("Enter the value of B :");
        b=sc.nextInt();
        max = (a>b) ? a : b ;
        System.out.println("Maximum from both = " + max);
    }
}