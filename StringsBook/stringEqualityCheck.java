package StringsBook;

public class stringEqualityCheck {

	public static void main(String[] args) {
	String str1 = "Hello";
	String str2 = "Hello";
	String str3 = "Good-bye";
	String str4 = "HELLO";
	
	System.out.println(str1+" equals "+str2+" = "+str1.equals(str2));
	System.out.println(str1+" equals "+str3+" = "+str1.equals(str3));
	System.out.println(str1+" equals "+str4+" = "+str1.equals(str4));
	System.out.println(str1+" equalsIgnoreCase "+str4+" = "+str1.equalsIgnoreCase(str4));

	}

}
