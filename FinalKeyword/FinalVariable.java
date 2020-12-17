package FinalKeyword;

public class FinalVariable {

	public static void main(String[] args) {
	final int NUM = 3;
	System.out.println("NUM = "+NUM);
	
//	NUM = NUM*3;			//value cannot be changed(immutable)
//	System.out.println("NUM x 3 = "+NUM);
	
	System.out.println("NUM x 3 = "+NUM*3); 		//can be done this way as it wont change the value
	}

}
