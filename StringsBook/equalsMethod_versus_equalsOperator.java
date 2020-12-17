package StringsBook;

public class equalsMethod_versus_equalsOperator {

	public static void main(String[] args) {
	String str1 = "Suraj";
	String str2 = new String(str1);
	System.out.println("String 1 = "+str1);
	System.out.println("String 2 = "+str2);
	
	System.out.println("String 1 "+" equals "+" String 2 "+" -> "+str1.equals(str2));
	System.out.println("String 1"+" == "+" String 2 "+" -> "+(str1==str2));
	}

}
