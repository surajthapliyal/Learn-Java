package conditional;
import java.util.Scanner;
public class ifElseExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        while(true)
        {
            System.out.println("\nEnter a number : ");
            n=sc.nextInt();
            if(n%2==0){
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        }
    }
}