package questions.normal_sites;

import java.util.Scanner;

public class binarySearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter key = ");
        int key = sc.nextInt();
        int ans = binarySearch(a,key);
        System.out.println("Key index = "+ ans);
        sc.close();
    }
    static int binarySearch(int a[],int key){
        int start = 0;
        int end = a.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(key == a[mid]){
                return mid;
            }else if(key > a[mid]){
                start = mid+1;
            }else if(key < a[mid]){
                end = mid-1;
            } 
        }
        return -1;
    }
}
