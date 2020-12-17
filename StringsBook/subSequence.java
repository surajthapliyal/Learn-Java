package StringsBook;

public class subSequence {

	public static void main(String[] args) {
		String s = "This method will return the substring(subSequence) of this string";
		CharSequence subString = s.subSequence(17,37);
		System.out.println("SubString = "+subString);
	}

}
