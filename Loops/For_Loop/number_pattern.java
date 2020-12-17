package Loops.For_Loop;
import java.util.Scanner;
public class number_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size = ");
        int n=sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>=(n+1)-i){
                System.out.print(k+" ");
                k+=1;
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}