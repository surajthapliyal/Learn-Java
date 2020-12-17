package StringsBook.StringBufferBuilder;

public class subString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Suraj thapliyal");
		System.out.println(sb);
		String s1 = sb.substring(6);
		System.out.println(s1);
		String s2 = sb.substring(0,5);
		System.out.println(s2);
	}

}
