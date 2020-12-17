package Loops.For_Loop;
import java.util.Scanner;
public class reverse_counting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter where to stop counting : ");
        int n=sc.nextInt();
        for(int i=100;i>=n;i--)
        {
            System.out.println(i);
        }
    }
}