package oops.NestedClass;

class o {
	int o_x = 100;

	void test() {
		i in = new i();
		in.display();
	}

	class i {
		int i_x = 200;

		void display() {
			System.out.println("Outer X = " + o_x); // can access directly all members of the outer class
		}
	}

	void display2() {
		System.out.println("Inner X = " + i_x); // cannot access any members of the inner class so it will gives error
	}
}

public class InnerMembersAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		o out = new o();
		out.test();
		out.display2(); // gives error
	}

}
