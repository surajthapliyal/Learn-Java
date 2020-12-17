package Stactic;
class classDemo{
	static int a = 42;
	static int b = 99;
	static void callMe() {
		System.out.println("a = "+a);
	}
}
public class UseStaticOutsideClass {

	public static void main(String[] args) {
		classDemo.callMe();
		System.out.println("b = "+classDemo.b);
	}

}
