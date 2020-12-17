package oops.Methods;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        if(isArmstrong(number)) System.out.println("Yes");
        else System.out.println("NO");
        sc.close();
    }
    static boolean isArmstrong(int num){
        int temp=num;
        int d=0;
        while(temp!=0)
        {
            int r=temp%10;
            d+=r*r*r;
            temp/=10;
        }
        if(d==num) return true;
        else return false;
    }
}