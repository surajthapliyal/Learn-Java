package questions.hackerRank;

import java.util.Scanner;

public class divisibleSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int k = sc.nextInt();
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if((a[i]+a[j])%k==0){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
