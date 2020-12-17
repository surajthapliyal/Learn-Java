package StringsBook;

public class StringLength {

	public static void main(String[] args) {
		char s[] = {'a','b','c','d','e'};
		String str = new String(s);		//using string object
		System.out.println("String = "+str);
		System.out.println("Length = "+str.length());
		
		String str2 = "abc";			//using string literals
		System.out.println("String 2 = "+str2);
		System.out.println("Length = "+str2.length());
		
		String str3 = "defghi";
		System.out.println("String 3 = "+str3);
		System.out.println("Length = "+str3.length());
		System.out.println("Length (with literal) = "+"defghi".length());
	}

}
