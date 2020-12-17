package oops.Methods;

class Test{
	int a,b;
	Test(int i,int j){
		a=i;
		b=j;
	}
	//return true if o is equal to the invoking object:
	boolean equalTo(Test o) {
		if(a==o.a && b==o.b) return true;
		else return false;
	}
}

public class ObjectsAsParameters {

	public static void main(String[] args) {
		Test t1 = new Test(1,2);
		Test t2 = new Test(1,2);
		Test t3 = new Test(4,5);
		System.out.println("t1 == t2 : " + t1.equalTo(t2));
		System.out.println("t1 == t3 : " + t1.equalTo(t3));
	}

}
