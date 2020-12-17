package Area;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
     int r=0;
     double pi=3.14,area=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter radius = ");
     r=sc.nextInt();
     area = pi*r*r;
     System.out.println("Area of circle = " + area);
     sc.close();
    }
}