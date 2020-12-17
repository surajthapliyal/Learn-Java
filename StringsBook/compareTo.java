package StringsBook;

public class compareTo {

	public static void main(String[] args) {
		String str1 = "suraj";
		String str2 = "suraj thapliyal";
		String str3 = "SurAj";
		String str4 = "suraj";

		System.out.println(str1.compareTo(str4)); //0 bcz both are same
		System.out.println(str1.compareTo(str2)); // -10 bcz str1 have 10 letter less than str2
		System.out.println(str2.compareTo(str1));// 10 bcz str2 have 10 letter extra than str1
		System.out.println(str1.compareTo(str3));// 32 bcz ASCII of s - ASCII of S = 32
		System.out.println(str1.compareToIgnoreCase(str3)); // 0 bcz both are same
	}

}
