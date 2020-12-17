package StringsBook.StringBufferBuilder;

public class charAt_setCharAt {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Suraj thapliyal");
		System.out.println(sb.charAt(6));
		sb.setCharAt(6, 'z');
		System.out.println(sb);
	}

}
