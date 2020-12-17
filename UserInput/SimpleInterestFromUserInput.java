package UserInput;
import java.util.Scanner;
public class SimpleInterestFromUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle : ");
        int p=sc.nextInt();
        System.out.println("Enter Rate : ");
        int rate=sc.nextInt();
        System.out.println("Enter time in hours : ");
        float time=sc.nextFloat();
        int SI=(int)(p*rate*time)/100;
        System.out.println("Simple Interest in integer form : " + SI);
    }   
}