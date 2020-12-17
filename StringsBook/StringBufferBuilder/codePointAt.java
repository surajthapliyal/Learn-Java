package StringsBook.StringBufferBuilder;

public class codePointAt {

	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Suraj");
	int ASCII = sb.codePointAt(2);
	System.out.println(ASCII);
	}
}
