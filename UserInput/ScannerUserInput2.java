package UserInput;
import java.util.Scanner;
public class ScannerUserInput2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer = ");
        int x=sc.nextInt();
        System.out.println(x);
        System.out.println("Enter decimal number = ");
        double y=sc.nextDouble();
        System.out.println(y);

        System.out.println("Enter a line =");  //Buffer need to be cleaned as we have taken three inputs continuously
        String sen=sc.nextLine();
        System.out.println(sen);
    }
}