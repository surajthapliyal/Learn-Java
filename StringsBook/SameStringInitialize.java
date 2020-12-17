package StringsBook;

public class SameStringInitialize {

	public static void main(String[] args) {
		char[] s = {'s','u','r','a','j'};
		String str1 = new String(s);
		String str2 = new String(str1);
		System.out.println("String 1 = "+str1);
		System.out.println("String 2 = "+str2);

	}

}
