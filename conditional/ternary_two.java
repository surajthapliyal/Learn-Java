package conditional;
import java.util.*;
public class ternary_two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a ;
        String check ;
        System.out.println("Enter a number :");
        a=sc.nextInt();
        check = a%2==0 ? "even" : "odd" ;
        System.out.println(check + " number");
    }
}