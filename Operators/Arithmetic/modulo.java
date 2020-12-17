package Operators.Arithmetic;
import java.util.Scanner;
public class modulo {
    public static void main(String[] args) {
        int a,b,remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        a=sc.nextInt();
        System.out.println("Enter the value of B : ");
        b=sc.nextInt();
        remainder = b%a;
        System.out.println("Remainder = " + remainder);
    }
}