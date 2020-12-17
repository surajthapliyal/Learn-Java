package Loops.For_Loop;
import java.util.Scanner;

public class exx {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                int length = s1.length()-16;
                System.out.print(String.format("%-15s",s1));
                System.out.printf("%03d\n",x);
            }
            System.out.println("================================");

    }
}



