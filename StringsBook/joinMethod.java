package StringsBook;

public class joinMethod {

	public static void main(String[] args) {
		String[] strArr = {"hello","world","fuck","Off"};
		String s = String.join(" ",strArr);
		System.out.println(s);
		
		
		String s1 = String.join(", ", "Suraj","Thapliyal","is","my","name.");
		System.out.println(s1);
		
	}

}
