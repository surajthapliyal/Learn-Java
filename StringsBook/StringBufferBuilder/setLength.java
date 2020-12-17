package StringsBook.StringBufferBuilder;

public class setLength {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Suraj");
		System.out.println(sb.length());
		sb.setLength(10);	 //if >originalLength then extra space fill with null character
		System.out.println(sb.length()); 
		System.out.println(sb); 	
		sb.setLength(4);	//if <originalLength then extra chracter get lost
		System.out.println(sb.length());
		System.out.println(sb);
	}

}
