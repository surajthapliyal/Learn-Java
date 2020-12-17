package oops.Methods;
class abcd{
	int a,b;
	abcd(int a,int b){
		this.a = a;
		this.b = b;
	}
	void change(abcd obj) {
		obj.a *= 2;
		obj.b /= 2;
	}
}
public class PassByRefrence {

	public static void main(String[] args) {
		abcd obj1 = new abcd(12,14);
		System.out.println("Before calling method : \na : "+obj1.a+"\nb : "+obj1.b);
		obj1.change(obj1);
		System.out.println("After calling method for obj1 : \na : "+obj1.a+"\nb : "+obj1.b);
	}

}
