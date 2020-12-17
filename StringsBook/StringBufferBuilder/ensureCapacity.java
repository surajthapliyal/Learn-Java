package StringsBook.StringBufferBuilder;

public class ensureCapacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Suraj");
		System.out.println(sb);
		System.out.println(sb.capacity()); // 16+5 = 21
		// if >21 then makes capacity = twice+2 = 21*2+2 = 42+2 = 44
		// if >twice+2 ,then make capacity = int passed in parameter
		// ex = if 43(i.e.,<44),then capacity = 44(twice+2)
		// ex = if 45(i.e.,>44), then capacity = 45(same as passed)
		
//		sb.ensureCapacity(22);			//44
		sb.ensureCapacity(45);			//45
		System.out.println(sb.capacity());		
		sb.ensureCapacity(56);		//45*2+2 =90+2=92 
		System.out.println(sb.capacity());		//92
	}

}
