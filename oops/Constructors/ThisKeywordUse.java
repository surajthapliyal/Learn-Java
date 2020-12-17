package oops.Constructors;
class vehicles{
    int wheels;
    vehicles(int wheels){
        this.wheels = wheels;
    }
}
public class ThisKeywordUse {
    public static void main(String[] args) {
        vehicles car=new vehicles(4);
        System.out.println(car.wheels+" wheels");
    }
}