package conditional;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a int number : ");
        int a=sc.nextInt();
        System.out.println("Enter another int number : ");
        int b=sc.nextInt();
        System.out.println("Enter operator : (+ , - , * , / ) ");
        sc.nextLine();
        char operator=sc.nextLine().charAt(0);
        switch (operator) {
            case '+':
                int plus = a+b ; 
                System.out.println(plus);
                break;
            case '-' :
                int minus = a-b;
                System.out.println(minus);
                break;
            case '*':
                int mul = a*b ;
                System.out.println(mul);
                break;
            case '/':
                float div = a/b ;
                System.out.println(div);
                break;
            default :
                System.out.println("Can't recognize the opeartor!!!");
        }
    }
}