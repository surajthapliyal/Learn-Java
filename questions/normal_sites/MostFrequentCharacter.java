package questions.normal_sites;

import java.util.Scanner;

public class MostFrequentCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string = ");
		String s = sc.nextLine();
		final int noOfChars = 256;
		int[] count = new int[noOfChars];
		for (int i : s.toCharArray()) {
			int index = (int) i;
			count[index]++;
		}
		int num=count[0];
		int index=0;
		for(int i=0;i<noOfChars;i++) {
			if(count[i]>num) {
				num = count[i];
				index = i;
			}
		}
		char max = (char) index;
		System.out.println("Most frequent character = "+max);
		sc.close();
	}

}
