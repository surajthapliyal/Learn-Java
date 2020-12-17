package questions.gfg;

import java.util.Scanner;

public class Replace0with5inInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			GfG g = new GfG();
			g.convertFive(n);
		}
	}
}// } Driver Code Ends

/* Complete the function below */
class GfG {
	public static void convertFive(int n) {
		int temp = n;
		int d = 0, r = 0;
		while (temp != 0) {
			r = temp % 10;
			if (r == 0) {
				r = 5;
			}
			d = d * 10 + r;
			temp /= 10;
		}
		int temp2 = d;
		int num = 0, r2 = 0;
		while (temp2 != 0) {
			r2 = temp2 % 10;
			num = num * 10 + r2;
			temp2 /= 10;
		}
		System.out.println(num);
	}
}
