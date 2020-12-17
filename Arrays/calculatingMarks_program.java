package Arrays;
import java.util.Scanner;
public class calculatingMarks_program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of students = ");
        int n=sc.nextInt();
        int[] students = new int[n];
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter marks of " + i + " student  = ");
            students[i]=sc.nextInt();
            sum+=students[i];
        }
        float average=sum/n;
        System.out.print("Average of marks of all students = " + average);
        
    }
}