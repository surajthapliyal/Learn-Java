package Strings;
import java.util.Scanner;
public class anagram_new_logic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string = ");
        String a=sc.nextLine();
        System.out.print("Enter another string = ");
        String b=sc.nextLine();
        boolean isAnagram = true;
        int[] al = new int[256];
        for(int c: a.toCharArray())
        {
            int index=(int) c;
            al[index]++;
        } 
        for(int c: b.toCharArray())
        {
            int index=(int) c;
            al[index]--;
        }
        for(int i=0;i<256;i++)
        {
            if(al[i]!=0)
            {
                isAnagram = false ;
                break;
            }
        }
        if(isAnagram) System.out.println("Anagram");
        else System.out.println("Not an anagram");
    }
}