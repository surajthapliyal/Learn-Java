package questions.hackerRank;

import java.util.*;

public class Java_String_Tokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String delims = "[ \n\t.',?!]+";
		String[] strArr = s.split(delims);
		for(String str : strArr )
		System.out.println(strArr.length);
		for(String a:strArr) {
			System.out.println(a);
		}
		scan.close();
	}

}
