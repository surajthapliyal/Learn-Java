package oops;
class abc{
	void show() {
		System.out.println("Show 1");
	}
}
class def extends abc{
	void show() {
		System.out.println("Show 2");
	}
}
class ghi extends def{
	void show() {
		System.out.println("Show 3");
	}
}
public class ObjectClass {

	public static void main(String[] args) {
		Object o1 ;  		//refrence of Object class which is the God Class
		
		abc a = new abc();
		def b = new def();
		ghi c = new ghi();
		
		o1 = a;
		((abc) o1).show();
		System.out.println(o1.equals(a));
		System.out.println(o1.getClass());
		
		o1 = b;
		((def) o1).show();
		System.out.println(o1.equals(b));
		System.out.println(o1.getClass());
		
		o1 = c;
		((ghi) o1).show();
		System.out.println(o1.equals(c));
		System.out.println(o1.getClass());
		
		System.out.println(o1.equals(o1));
		System.out.println(o1.equals(a));			//gives false as current o1 is c
		System.out.println(o1.equals(b));			//gives false as current o1 is c
		
		
		
	}

}
