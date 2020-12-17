package Operators.Arithmetic;
import java.util.Scanner;
public class divide {
    public static void main(String[] args) {
        int a,b,int_answer;
        double double_answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        a=sc.nextInt();
        System.out.println("Enter the value of B : ");
        b=sc.nextInt();
        int_answer = b/a; //gives in integer
        System.out.println("Integer answer = " + int_answer);
        double_answer = (double) b / (double) a ;
        System.out.println("Double answer = " + double_answer);
    }
}