package Strings;
import java.util.Scanner;
public class reverse_sentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence = ");
        String s=sc.nextLine();
        s=s.trim();
        String[] words=s.split(" ");
        for(int i=words.length-1;i>=0;i--)
        {
            System.out.print(words[i]+" ");
        }
    }
}