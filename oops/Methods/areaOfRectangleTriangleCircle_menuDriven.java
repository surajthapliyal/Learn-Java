package oops.Methods;
import java.util.Scanner;
public class areaOfRectangleTriangleCircle_menuDriven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        float ar,x,y,z;
        System.out.println("Whose area you want : \n");
        System.out.println("1.Circle\n2.Rectangle\n3.Triangle\n4.Square\n5.Exit.");
        do {
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter radius = ");
                    x=sc.nextFloat();
                    ar = circle(x);
                    displayArea(ar);
                    break;
            
                case 2:
                    System.out.print("Enter length of rectangle = ");
                    x=sc.nextFloat();
                    System.out.print("Enter breadth of rectangle = ");
                    y=sc.nextFloat();
                    ar = rectangle(x,y);
                    displayArea(ar);
                    break;

                case 3:
                    System.out.print("Enter 1st side of triangle = ");
                    x=sc.nextFloat();
                    System.out.print("Enter 2nd side of triangle = ");
                    y=sc.nextFloat();
                    System.out.print("Enter 3rd side of triangle = ");
                    z=sc.nextFloat();
                    ar = triangle(x,y,z);
                    displayArea(ar);
                    break;

                case 4:
                    System.out.print("Enter side of square = ");
                    x=sc.nextFloat();
                    ar = square(x);
                    displayArea(ar);
                    break;
                
                case 5:
                    System.out.println("Program Terminated.\n");
                    System.exit(1);
                    break;
                default:
                    break;
            }
        } while (choice!=5);
        sc.close();
    }
    static float circle(float r){
        float area = 3.14f*r*r;
        return area;  
    }
    static float rectangle(float l,float b){
        float area = l*b;
        return area;
    }
    static float triangle(float a,float b,float c){
        float s,area;
        s=(a+b+c)/2;
        area = s*(s-a)*(s-b)*(s-c);
        area = (float)Math.pow(area, 0.5);
        return area;
    }
    static float square(float side){
        float area;
        area=side*side;
        return area;
    }
    static void displayArea(float area){
        System.out.println("Area = "+area);
    }
}