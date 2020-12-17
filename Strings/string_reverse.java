package Strings;
import java.util.Scanner;
public class string_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string = ");
        String a = sc.nextLine();
        int length = a.length();
        for(int i=length-1;i>=0;i--)
        {
            System.out.print(a.charAt(i));
        }
    }
}