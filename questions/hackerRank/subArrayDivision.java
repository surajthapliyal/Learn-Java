package questions.hackerRank;

import java.util.Scanner;

public class subArrayDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        int length = sc.nextInt();
        int way = 0;
        int subArraySum = 0;
        for(int i=0;i<=size-length;i++){
            subArraySum = 0;
            for(int j=0;j<length;j++){
                subArraySum+=a[i+j];
            }
            if (subArraySum == sum) {
                way++;
            }
        }
        System.out.println(way);
        sc.close();
    }
}
