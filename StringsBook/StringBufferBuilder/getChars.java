package StringsBook.StringBufferBuilder;

public class getChars {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Suraj.thapliyal");
		char[] charArr = new char[7];
		sb.getChars(4, 11, charArr, 0);
		for (char chars : charArr) {
			System.out.print(chars+" ");
		}
	}

}
