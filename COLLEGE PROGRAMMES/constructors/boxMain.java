import java.util.Scanner;

class box{
    double l,b,h;

    // default constructor : 
    box(){
        l = 10;
        b = 20;
        h = 30;
    }

    // parameterized constructor :
    box(double x , double y , double z){
        l = x;
        b = y;
        h = z;
    }
    double volume(){
        return l*b*h;
    }
}
public class boxMain {
    public static void main(String[] args) {
        box b1 = new box();
        System.out.println("Volume of box1 = "+b1.volume());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length for box2 = ");
        double a = sc.nextDouble();
        System.out.print("Enter breadth for box2 = ");
        double b = sc.nextDouble();
        System.out.print("Enter depth for box2 = ");
        double c = sc.nextDouble();
        box b2 = new box(a , b , c);
        System.out.println("Volume od box2 = " + b2.volume());

        sc.close();
    }
}
