package FinalKeyword;

public class FinalMethod extends FinalMethodClass {
//	public void getDescription() {
//		System.out.println("Inside Main Class");	//Method override cant be done if prev method is final
//	}
	public static void main(String[] args) {
		FinalMethod obj1 = new FinalMethod();
		obj1.getDescription(); 		//can be accessed due to inheritance
	}

}
