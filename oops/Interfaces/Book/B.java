package oops.Interfaces.Book;

public class B implements A.NestedInf {

	@Override
	public boolean isEven(int x) {

		return x % 2 == 0 ? true : false;
	}

}
