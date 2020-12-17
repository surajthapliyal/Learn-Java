package StringsBook.StringBufferBuilder;

public class delete_deleteCharAt {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Suraj thapliyal");
		System.out.println(sb);
		sb.delete(6, 15);
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
	}

}
