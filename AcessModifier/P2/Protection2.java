package AcessModifier.P2;

import AcessModifier.P1.Protection;

public class Protection2 extends Protection { // subclass of Portection in P1 package
	Protection2(){
		System.out.println("Protection 2 constructor.");
//		System.out.println("n = "+n);			//wont be visible(accessed) as it was default type.
//		System.out.println("n_pri = "+n_pri);	//wont be visible(accessed) as it was private
		System.out.println("n_pro = "+n_pro);
		System.out.println("n_pub = "+n_pub);
	}
}
