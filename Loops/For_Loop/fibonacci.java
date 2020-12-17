package Loops.For_Loop;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many terms you want to print = ");
        int n=sc.nextInt();
        int a=0,b=1,c;
        if(n==1){
            System.out.println(a);
        }
        if(n==2){
            System.out.println(b);
        }
        else{
            System.out.print(a+" "+b+" ");
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    }
}