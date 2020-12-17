package questions.normal_sites;
import java.util.Scanner;
public class remove_specific_element_form_an_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of the array = ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" element = ");
            a[i]=sc.nextInt();
        }
        System.out.println("Array :");
        for(int each: a)
        {
            System.out.print(" "+each+" ");
        }
        System.out.print("\nEnter element to delete = ");
        int num=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==num)
            {
                for(int j=i;j<n-1;j++)
                {
                    a[j]=a[j+1];
                }
            }
        }
        System.out.println("\nArray :");
        for(int each: a)
        System.out.print(" "+each+" ");
    }
}