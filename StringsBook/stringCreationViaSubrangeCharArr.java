package StringsBook;

public class stringCreationViaSubrangeCharArr {

	public static void main(String[] args) {
		char[] s = {'s','u','r','a','j'};
		String str = new String(s,1,3);   //(nameOfString,StartIndex,NumberOfCharacters)
		System.out.println("String = "+str);
	}

}
