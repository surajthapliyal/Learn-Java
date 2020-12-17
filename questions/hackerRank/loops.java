package questions.hackerRank;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int queries = sc.nextInt();
        for(int i=0;i<queries;i++)
        {
           int a=sc.nextInt();
           int b=sc.nextInt();
           int n=sc.nextInt();
           int k=1;
           int val=a+k*b;
           System.out.print(val+" ");
           k++;
           for(int j=0;j<n-1;j++)
           {
               val+=k*b;
               System.out.print(val+" ");
               k=k*2;
           }
           System.out.println();
        }
        sc.close();
    }
}