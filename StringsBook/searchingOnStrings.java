package StringsBook;

public class searchingOnStrings {

	public static void main(String[] args) {
		String s = "my name is suraj thapliyal is my name";
		System.out.println("String  = "+s);
		
		System.out.println(s.indexOf('a'));		//4
		System.out.println(s.indexOf('a', 12));		//14
		System.out.println(s.lastIndexOf('a'));	//34
		System.out.println(s.lastIndexOf('a', 6));		//4
		
		System.out.println(s.indexOf("my name"));		//0
		System.out.println(s.indexOf("is", 15));		//27
		System.out.println(s.lastIndexOf("my name"));		//30
		System.out.println(s.lastIndexOf("is",12));		//8
		
	}

}
