package StringsBook.StringBufferBuilder;

public class codePointBefore {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Suraj");
		int ASCIIbefore = sb.codePointBefore(2);
		System.out.println(ASCIIbefore);
	}

}
