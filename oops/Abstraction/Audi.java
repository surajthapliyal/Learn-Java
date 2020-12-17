package oops.Abstraction;

public class Audi extends Car {

	@Override
	void accelerating() {
		System.out.println("Audi is Accelerating.");
	}

	@Override
	void breaking() {
		System.out.println("Audi is Breaking.");
	}

}
