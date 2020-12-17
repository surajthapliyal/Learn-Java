package Stactic;

public class WithoutStatic {
	
	int x = 0;

	public static void main(String[] args) {
		
//		System.out.println("X = " + x); // cant access it directly as it is not static
		
		//to access it without static we have to make a object then call it as a member
		WithoutStatic obj = new WithoutStatic();
		System.out.println("X = "+obj.x);
	}

}
