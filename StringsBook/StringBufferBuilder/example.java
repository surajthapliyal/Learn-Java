package StringsBook.StringBufferBuilder;

public class example {

	public static void main(String[] args) {
	String s = new String("Suraj");
	s.concat(" Thapliyal");
	System.out.println(s); 		//will not get change as strings are mutable;
	
	StringBuffer sb = new StringBuffer("Suraj");
	sb.append(" Thapliyal");	
	System.out.println(sb);		//will change it as stringBuffer are immutable;
	
	StringBuilder sb1 = new StringBuilder("Suraj");
	sb1.append(" Thapliyal");
	System.out.println(sb1);	//will change it(fast than buffer) as stringBuffer are immutable;
 	}

}
