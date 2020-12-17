package StringsBook;

public class otherStringMethods {

	public static void main(String[] args) {

		String s = "Hello my name is Suraj Thapliyal.";
		String s1 = "Hello my name is Suraj Thapliyal.";
		
		System.out.println(s.codePointAt(4));
		System.out.println(s.codePointBefore(4));
		System.out.println(s.codePointCount(2, 4));
		System.out.println(s.contains("Hello"));
		System.out.println(s.contentEquals(s1));
		System.out.println(s.isEmpty());
		
		
	}

}
