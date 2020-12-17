package StringsBook;

public class ByteArrToCharString {
	public static void main(String[] args) {
		byte[] ASCII = {65,66,67,68,69,70};
		String charArr = new String(ASCII);
		System.out.println("String = "+charArr);
		
		String subRange = new String(ASCII,2,3);
		System.out.println("Subrange String = "+subRange);
	}
}
