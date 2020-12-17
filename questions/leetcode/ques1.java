package questions.leetcode;
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array = ");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter elements to be entered in the array : ");
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter element = ");
            nums[i]=sc.nextInt();
        }
        System.out.println("Array entered : ");
        for(int item: nums)
        {
            System.out.print(item+" ");
        }
        System.out.print("Enter target sum = ");
        int target = sc.nextInt();
        int[] ans = new int[size];
        int k=0;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size-1;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println(i+" "+j);
                    ans[k]=i;
                    ans[k+1]=j;
                }
            }
        }

        sc.close();
    }
}