package questions.hackerRank;
import java.util.Scanner;
public class currencyFormatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount = ");
        String amount=sc.nextLine();
        String[] a=amount.split(".");
        for(int i=0;i<a.length-1;i++)
        {
            System.out.print(a[i]);
        }
}
}