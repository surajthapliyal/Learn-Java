package questions.normal_sites;

import java.util.Scanner;

public class AllCharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string = ");
		String s = sc.nextLine();
		final int noOfChars = 256;
		int[] ASCII = new int[noOfChars];
		for (int i : s.toCharArray()) {
			int index = (int) i;
			ASCII[index]++;
		}
		for (int j = 0; j < 256; j++) {
			if(ASCII[j]>0) {
					char ch = (char) j;
					System.out.print(ch+" = "+ASCII[j]+" ");
				}
			}
		}
	}


