package oops.ClassAndObjects;

public class ObjectRefernce {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = b1;
		
		b1.depth = 10;
		b1.width = 15;
		b1.height = 20;
		System.out.println("For b1 = " + b1.depth +"  "+ b1.width +"  "+ b1.height);
		
		b2.depth = 25;
		b2.width = 30;
		b2.height = 35;
		System.out.println("For b2 = " + b2.depth +"  "+ b2.width +"  "+ b2.height);
		//these changes will also effect b1 as both are same : 
		System.out.println("For b1 = " + b1.depth +"  "+ b1.width +"  "+ b1.height);
		
		
		b1=null; //dereference b1 object but b2 will not.
		System.out.println("For b2 = " + b2.depth +"  "+ b2.width +"  "+ b2.height);
		
	}
}
