package oops.Constructors;
class Vehicles{
    int wheels;
    int headLights;
    Vehicles(int noOfWheels){
        wheels = noOfWheels;
        headLights=2;
    }
}
public class ParameterizedConstructors {
    public static void main(String[] args) {
        Vehicles car = new Vehicles(4);
        System.out.println("My car has "+car.wheels+" wheels and "+car.headLights+" headlights");
        Vehicles scooty = new Vehicles(2);
        System.out.println("My scooty has "+scooty.wheels+" wheels and "+scooty.headLights+" headlights");
    }
}