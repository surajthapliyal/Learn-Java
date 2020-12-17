package oops.NestedClass;

class outerClass {
	int outer_x = 100;

	void test() {
		for (int i = 0; i < 10; i++) {
			class innerClass {
				void display() {
					System.out.println("Display : outer_x =  " + outer_x);
				}
			}
			innerClass in = new innerClass();
			in.display();
		}
	}
}

public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerClass out = new outerClass();
		out.test();
	}

}
