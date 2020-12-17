package StringsBook;

public class getBytes {

	public static void main(String[] args) {
		String s = "suraj";
		byte[] byteArr = s.getBytes();
		for (int i = 0; i < byteArr.length; i++) {
			System.out.print(byteArr[i]+" ");
		}
	}

}
