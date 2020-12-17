package questions.normal_sites;
import java.util.Scanner;

public class printAllSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int [size];
        System.out.println("Enter elements for the array : ");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("\nEntered array = ");
        for(int each : a){
            System.out.print(each+" ");
        }

        System.out.println("\nSubarrays in the given array : ");
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
