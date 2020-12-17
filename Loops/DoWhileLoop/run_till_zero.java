package Loops.DoWhileLoop;
import java.util.Scanner;
public class run_till_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=1;
        do{
            n=sc.nextInt();
            System.out.println("n = "+n);
        }while(n!=0);
    }
}