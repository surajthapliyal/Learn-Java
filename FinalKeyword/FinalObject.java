package FinalKeyword;

class Student {
	int rollNo;
	String name;
}

public class FinalObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Student obj1 = new Student();
		Student obj2 = new Student();
//		obj1 = obj2;				//cannot be done as we cant change refrence of the final object
									//as obj 1 is just like a refrence of the object itself. but,
		
		obj1.name = "Suraj"; 		//we can still modify final object states.
		obj1.rollNo = 19;
		System.out.println("Obj1 = "+obj1.name+" "+obj1.rollNo+".");
		obj2.name = "Thapliyal";
		obj2.rollNo = 20;
		System.out.println("Obj2 = "+obj2.name+" "+obj2.rollNo+".");
	}

}
