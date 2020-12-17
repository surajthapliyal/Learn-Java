package oops.Methods;
import java.util.Scanner;
public class string_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        if(isPalindrome(s)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
    static boolean isPalindrome(String s)
    {
        char[] letters=s.toCharArray();
        boolean hai = true;
        for(int i=0,j=letters.length-1; i<letters.length-1/2;i++,j--)
        {
            if(letters[i]!=letters[j]) hai=false;
        }
        return hai;
    }
}