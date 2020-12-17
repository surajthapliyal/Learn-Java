package Stactic;

public class UseStaticInsideClass {			//using it inside its class
	
	static int a = 3;				//1
	static int b;
	
	static void meth(int x) {			//4
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	static {						//2
		System.out.println("Static Block initialized");
		b = a*4;
	}

	public static void main(String[] args) {			//3
		UseStaticInsideClass.meth(42);
	}

}
