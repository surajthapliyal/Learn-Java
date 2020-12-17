package questions.normal_sites;

import java.util.Arrays;
import java.util.Scanner;

public class IndexAllAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string = ");
		String s = sc.nextLine();
		System.out.println("String entered = "+s);
		char[] charArr = s.toCharArray();
		Arrays.sort(charArr);
		for(int i=0;i<charArr.length;i++) {
			System.out.println(charArr[i]+" = "+s.indexOf(charArr[i]));
		}
		sc.close();
	}

}
