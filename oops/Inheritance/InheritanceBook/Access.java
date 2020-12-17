/*In the class heirarchy private menbers remains private , this program contains an error
 * and will not compile.
 */
package oops.Inheritance.InheritanceBook;

class C { // superClass
	int i; // public by default
	private int j; // private to C

	void setij(int x, int y) {
		i = x;
		j = y;
	}
}

class D extends C {
	int total;

	void sum() {
		total = i + j; // error, j is not accessible here.
	}
}

public class Access {

	public static void main(String[] args) {
		D subOb = new D();
		subOb.setij(10, 12);
		subOb.sum();
		System.out.println("Total is = "+subOb.total);
	}

}
