package FinalKeyword;
abstract class A{		//gives compile time error if we make it final too along with abstract
	final void callme() {
		System.out.println("Im called!!");
	}
	abstract void callmeToo();
}
final class B extends A{
	@Override
	void callmeToo() {
		System.out.println("Im called twice!!");
	}
}
public class PreventInheritance {

	public static void main(String[] args) {
	B obj = new B();
	obj.callme();
	obj.callmeToo();
	}

}
