package StringsBook.StringBufferBuilder;

public class trimToSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Suraj thapliyal");
		System.out.println(sb.capacity());  //15+16 = 31
		sb.trimToSize();
		System.out.println(sb.capacity());  //31-16 = 15
	}

}
