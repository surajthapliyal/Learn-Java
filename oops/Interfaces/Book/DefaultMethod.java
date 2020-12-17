package oops.Interfaces.Book;
interface MyINF{
	int getNumber();
	default String getString() {
		return "DEFAULT STRING";
	}
}
class MyINF2 implements MyINF{

	@Override
	public int getNumber() {
		return 100;
	}
//	public String getString() {		//can be override too
//		return "THIS IS A DIFFERENT STRING";
//	}
}
public class DefaultMethod {

	public static void main(String[] args) {
		MyINF2 obj = new MyINF2();
		System.out.println(obj.getNumber());
		System.out.println(obj.getString());
	}
}
