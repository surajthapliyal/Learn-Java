package questions.hackerRank;
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter string 1 = ");
        String s1=sc.nextLine();
        // System.out.print("Enter string 2 = ");
        String s2=sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        System.out.println(s1.length()+s2.length());
        if(s1.compareTo(s2)>0)
        System.out.println("Yes");
        else System.out.println("No");
        System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1)+" "+s2.substring(0,1).toUpperCase()+s2.substring(1));
        sc.close();
    }
}