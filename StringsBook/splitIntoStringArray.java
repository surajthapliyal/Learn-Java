package StringsBook;

public class splitIntoStringArray {
	public static void main(String[] args) {
		String s = "This will make it a String array ";
		System.out.println("String = "+s);
		String[]  stringArr = s.split(" ");
		System.out.println("String array : ");
		for(String name:stringArr) {
			System.out.print(name+"  ");
		}
	}
}
