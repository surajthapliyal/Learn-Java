package StringsBook;

public class getChars {

	public static void main(String[] args) {
		String s = "This is the demo string for getChars method.";
		System.out.println("String = "+s);
		char[] charArr = new char[6];
		s.getChars(17, 23, charArr, 0);
		String sub = new String(charArr);
		System.out.println("charArr = "+sub);
		for(char chars : charArr) {
			System.out.print(chars+"  ");
		}
		
		
	}

}
