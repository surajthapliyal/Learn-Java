package StringsBook;

public class replaceAll {

	public static void main(String[] args) {
		String s = "This will replace all regularExpression strings with new string.";
		System.out.println("String = "+s);
		String newString = s.replaceAll("wi","lo");
		System.out.println("String after = "+newString);
	}

}
