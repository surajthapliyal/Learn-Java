package oops.Interfaces.Book;

import oops.Interfaces.Book.AA.BB;
import oops.Interfaces.Book.AA.BB.CC;

interface AA {
	public void AA_method();

	interface BB {
		public void BB_method();

		interface CC {
			public void CC_method();
		}
	}
}

class infClass implements AA, BB, CC {

	@Override
	public void CC_method() {
		System.out.println("CC_method is called.");
	}

	@Override
	public void BB_method() {
		System.out.println("BB_method is called.");
	}

	@Override
	public void AA_method() {
		System.out.println("AA_method is called.");
	}

}

public class NestedInterface2 {

	public static void main(String[] args) {

		infClass obj = new infClass();
		obj.AA_method();
		obj.BB_method();
		obj.CC_method();
		System.out.println();
		AA aref = obj;
		aref.AA_method();
		System.out.println();
		BB bref = obj;
		bref.BB_method();
		System.out.println();
		CC cref = obj;
		cref.CC_method();
		System.out.println();
	}
}