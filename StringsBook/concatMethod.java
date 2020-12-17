package StringsBook;

public class concatMethod {

	public static void main(String[] args) {
		String s1 = "one";
		String s2 = s1.concat(" two");
		System.out.println(s2);
		
		String s3 = s1+" two";
		System.out.println(s3);
		
		//both are same
	}

}
