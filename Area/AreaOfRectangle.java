package Area;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        int length=0,breadth=0,area=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length (in cm.): ");
        length = sc.nextInt();
        System.out.println("Enter breadth (in cm.): ");
        breadth = sc.nextInt();
        area = length * breadth;
        System.out.println("Area of Rectangle = " + area + "cmsquare.");
        sc.close();
    }
}