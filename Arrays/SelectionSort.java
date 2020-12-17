package Arrays;
import java.util.Scanner;
public class SelectionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the elements to be stored in the array : ");
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter "+(i+1)+" element = ");
            a[i]=sc.nextInt();
        }
        System.out.print("Unsorted array = ");
        for(int each: a)
            System.out.print(each+" ");
        for(int i=0;i<size;i++)
        {
            int minInd=i;
            for(int j=i+1;j<size;j++)
            {
                if(a[j]<a[minInd])
                minInd=j;
            }
            int temp=a[minInd];
            a[minInd]=a[i];
            a[i]=temp;
        }
        System.out.print("\nSorted array = ");
        for(int each: a)
            System.out.print(each+" ");
    }
}