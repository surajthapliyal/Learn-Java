package StringsBook.StringBufferBuilder;

public class indexOf_string {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Suraj Thapliyal");
		System.out.println(sb.indexOf("liyal")); //give index of l (-1 if not found).
		
		StringBuffer sb1 = new StringBuffer("my name is suraj is my name");
		System.out.println(sb1.indexOf("my name", 10));
	}
}
