package StringsBook;

public class charAt {

	public static void main(String[] args) {
	String s = new String();
	s = "hello";
	System.out.println("String = " + s);
	System.out.println(s.charAt(2));
	
	//or
	
	System.out.println("suraj".charAt(2));
	
	//or
	
	char ch ;
	ch="thapliyal".charAt(5);
	System.out.println(ch);
	
	//or
	
	String str = "hanji";
	System.out.println(str.charAt(2));
	
	//or
	
	char[] arr= {'s','u','r','a','j'};
	String str2 = new String(arr);
	System.out.println(str2.charAt(3));

	}

}
