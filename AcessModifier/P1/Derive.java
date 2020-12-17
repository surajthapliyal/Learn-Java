package AcessModifier.P1;

public class Derive extends Protection {		//subclass of protection:
	Derive(){
		System.out.println("Derived Constructor.");
		System.out.println("n = "+n);
//		System.out.println("n_pri = "+4+n_pri);		//wont be accessed(visible).
		System.out.println("n_pro = "+n_pro);
		System.out.println("n_pub = "+n_pub);
	}
}
