package StringsBook;

public class replaceFirst {

	public static void main(String[] args) {
		String s = "This will replace the first occuring string that matches with regularString";
		System.out.println("String = "+s);
		String newString = s.replaceFirst("wi","lo");
		System.out.println("New String = "+newString);
	}

}
