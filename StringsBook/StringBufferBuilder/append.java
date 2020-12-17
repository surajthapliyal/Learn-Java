package StringsBook.StringBufferBuilder;

public class append {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Suraj");
		System.out.println(sb);
		sb.append(" Thapliyal is ");	//string append
		System.out.println(sb);
		int age = 20;
		sb.append(age);		//int append
		sb.append(" years old.");
		System.out.println(sb);
		sb.append(true);		//boolean Append
		System.out.println(sb);
	}

}
