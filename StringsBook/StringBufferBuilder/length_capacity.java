package StringsBook.StringBufferBuilder;

public class length_capacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("suraj");
		System.out.println("String Buffer = "+sb);
		int lengthOfBuffer = sb.length();
		System.out.println("Length of String Buffer = "+lengthOfBuffer);	//5
		int capacityOfBuffer = sb.capacity();
		System.out.println("Capacity of String Buffer = "+capacityOfBuffer);	//5+16 = 21
	}

}
