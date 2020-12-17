package Operators.Arithmetic;
import java.util.Scanner;
public class a_plus_b_whole_square {
    public static void main(String[] args) {
        int a,b,answer1,answer2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of A:");
        a=sc.nextInt();
        System.out.println("Enter value of B:");
        b=sc.nextInt();
        answer1 = (a+b)*(a+b);
        answer2 = a*a + b*b + 2*a*b;
        System.out.println("Answer = " + answer1);
        System.out.println("Answer = " + answer2);
    }
}