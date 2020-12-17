package Loops.For_Loop;
import java.util.Scanner;
public class series2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit = ");
        int n=sc.nextInt();
        float sum=0;
        for(float i=1;i<=n;i++)
        {
            if(i%2==0){
                 sum+=-(1/i);
            }
             else {
                 sum+=1/i;
            }
        }
        System.out.println(sum);
    }
}