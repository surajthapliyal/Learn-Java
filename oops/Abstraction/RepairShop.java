package oops.Abstraction;

public class RepairShop {

	public static void repairCar(Car obj) {
		System.out.println("Car is repaired.");
	}

	public static void main(String[] args) {
		WagonR wagonr = new  WagonR();
		Audi audi = new Audi();
//		Car car = new Car();
		repairCar(audi);
		repairCar(wagonr);
	}

}
