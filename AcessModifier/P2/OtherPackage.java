package AcessModifier.P2;

import AcessModifier.P1.Protection;

public class OtherPackage {
OtherPackage(){
	Protection  p = new Protection();		//obj of Protection by importing this class .
	System.out.println("Other Package Constructor.");
//	System.out.println("n = "+p.n);			//wont be accessed(visible) as it was default
//	System.out.println("n_pri = "+p.n_pri); //wont be accessed(visible) as it was private
//	System.out.println("n_pro = "+p.n_pro); //wont be accessed(visible) as it was protected
	System.out.println("n_pub = "+p.n_pub);
}
}
