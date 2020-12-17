package oops.Inheritance.InheritanceBook;
class AA{
	int i,j;
	AA(int i,int j){
		this.i = i;
		this.j = j;
	}
	void show() {
		System.out.println("i = "+i+" j = "+j);
	}
}
class BB extends AA{
	int k;
	BB(int i,int j,int k){
		super(i,j);
		this.k = k;
	}
	//override method :
	void show() {
		System.out.println("k = "+k);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		BB obj = new BB(1,2,3);
		obj.show();
	}

}
