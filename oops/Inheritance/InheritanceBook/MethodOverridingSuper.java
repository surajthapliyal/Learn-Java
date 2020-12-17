package oops.Inheritance.InheritanceBook;

class AAA {
	int i, j;

	AAA(int i, int j) {
		this.i = i;
		this.j = j;
	}

	void show() {
		System.out.println("i = " + i + " j = " + j);
	}
}

class BBB extends AAA {
	int k;

	BBB(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}

	// override method :
	void show() {
		super.show();
		System.out.println("k = " + k);
	}
}

public class MethodOverridingSuper {
	public static void main(String[] args) {
		BBB obj = new BBB(1, 2, 3);
		obj.show();
	}

}
