package questions.normal_sites;

import java.util.Scanner;

public class linearSearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter key = ");
        int key = sc.nextInt();
        int ans = findKey(a,key);
        System.out.println("key index= "+ans);
        sc.close();
    }
    static int findKey(int a[],int key){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
