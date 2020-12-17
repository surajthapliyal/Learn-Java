package questions.gfg;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointersAlgorithm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int[ ] nums = new int[size];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<size;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("\nArray entered: ");
		for(int each:nums) {
			System.out.print(each+" ");
		}
		Arrays.sort(nums);
		System.out.println("\nSorted array : ");
		for(int each:nums) {
			System.out.print(each+" ");
		}
		System.out.print("\nEnter target sum = ");
		int target = sc.nextInt();
		int i=0,j=size-1;
		while(i<j) {
			if(nums[i]+nums[j]<target) {
				i++;
			}else if (nums[i]+nums[j]>target) {
				j--;
			}else {
				System.out.println("Index = "+i+" and "+j);
				break;
			}
		}
	}

}
