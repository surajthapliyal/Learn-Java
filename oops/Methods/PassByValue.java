package oops.Methods;
class abc{
	void meth(int i,int j) {
		i*=2;
		j/=2;
	}
}

public class PassByValue {
	public static void main(String[] args) {
		abc a1 = new abc();
		int a=15,b=20;
		System.out.println("Before calling method : \na = "+a+"\nb = "+b);
		a1.meth(a,b);
		System.out.println("After calling method : \na = "+a+"\nb = "+b);
	}
}