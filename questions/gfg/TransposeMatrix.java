package questions.gfg;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int size=sc.nextInt();
			int a[][]=new int[size][size];
			for(int j=0;j<size;j++)
			{
				for(int k=0;k<size;k++)
				{
					a[j][k]=sc.nextInt();
				}
			}
			System.out.println("Transpose of above square matrix :");
			for(int l=0;l<size;l++)
			{
				for(int m=0;m<size;m++)
				{
					System.out.print(a[m][l]+" ");
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
