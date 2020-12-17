package conditional;
import java.util.Scanner;
public class if_elseIf_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a number to check :");
        a=sc.nextInt();
        if (a>=0 && a<=10) {
            System.out.println("Number is less than 10");
        } else if (a>10 && a<=20) {
            System.out.println("Number is less than 20 and greater than 10");
        } else if (a>20 && a<=30) {
            System.out.println("Number is less than 30 and greater than 20");
        } else if (a<0) {
            System.out.println("Number is negative");    
        }else {
            System.out.println("Number is greater than 30");
        }
    }
}