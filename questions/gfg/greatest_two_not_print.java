package questions.gfg;
import java.util.Scanner;
import java.util.Arrays;
public class greatest_two_not_print {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
        {
            int size=sc.nextInt();
            int[] a=new int[size];
            for(int j=0;j<size;j++)
            {
                a[j]=sc.nextInt();
            }
            Arrays.sort(a);
            for(int k=0;k<=size-3;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
	}
}
