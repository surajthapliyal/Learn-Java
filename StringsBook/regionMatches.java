package StringsBook;

public class regionMatches {

	public static void main(String[] args) {
		String str1 = "thapliyal";
		String str2 = "suraj thapliyal";
		String str3 = "thAplIyal";

		System.out.println(str1 + " regionMatches " + str2 + " = " + 
				str1.regionMatches(0,str2,6,8));

		System.out.println(str3+" regionMatches "+str2+" = "+
				str3.regionMatches(0, str2, 6, 8));
		
		System.out.println(str3+" regionMatches(ignore case) "+str2+" = "+
				str3.regionMatches(true, 0, str2, 6, 8));

	}

}
