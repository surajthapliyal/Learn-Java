package StringsBook;

public class StringConcatenationWithOtherDataType {

	public static void main(String[] args) {
		int age = 19;
		String str1 = "He is "+age+" years old.";
		System.out.println("String 1 = "+str1);
		
		String str2 = "four : "+2+2;   // will make it 22 bcz of string representation
		System.out.println("String 2= "+str2);

		String str3 = "four : "+(2+2);  // will make it 4
		System.out.println("String 3 = "+str3);
	}

}
