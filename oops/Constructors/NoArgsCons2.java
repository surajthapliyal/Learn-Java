package oops.Constructors;
class Vehicles{
    int wheels;
    Vehicles(){
        wheels=4;
    }
}
public class NoArgsCons2 {
    public static void main(String[] args) {
        Vehicles car=new Vehicles();
        System.out.println("My Car has "+car.wheels+" wheels");
    }
}