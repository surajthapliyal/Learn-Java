package Arrays;
import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array = ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" element = ");
            a[i]=sc.nextInt();
        }
        System.out.println("Array entered : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]+" ");
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=0;
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\n Sorted array : ");
        for(int item: a)
        {
            System.out.print(" "+item+" ");
        }
    }
}