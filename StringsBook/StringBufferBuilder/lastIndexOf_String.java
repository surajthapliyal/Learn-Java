package StringsBook.StringBufferBuilder;

public class lastIndexOf_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Suraj is my name is suraj");
		System.out.println(sb.lastIndexOf("suraj"));
		
		StringBuffer sb1 = new StringBuffer("suraj suraj suraj suraj suraj");
		System.out.println(sb1.lastIndexOf("suraj", 12));//lastIndex-1 = 11index se searching start
	}

}
