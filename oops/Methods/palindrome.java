package oops.Methods;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        if(isPalindrome(number)) System.out.println("Palindrome number.");
        else System.out.println("Not a Palindrome number.");
        sc.close();
    }
    static boolean isPalindrome(int num){
        int temp=num;
        int d=0,r=0;
        while(temp!=0)
        {
            r=temp%10;
            d=d*10+r;
            temp/=10;
        }
        if(d==num) return true;
        else return false;
    }
}