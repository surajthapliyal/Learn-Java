package questions.normal_sites;

import java.util.Scanner;

public class AllPrimeNumberTillN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n = ");
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) System.out.print(i+" ");
		}
	}
	static boolean isPrime(int num) {
		if(num<=1) return false;
		for(int i=2;i<num;i++) 
			if(num%i==0) return false;
		return true;
	}
}
