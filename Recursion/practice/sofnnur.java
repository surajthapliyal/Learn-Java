package Recursion.practice;

import java.util.Scanner;

public class sofnnur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = findSum(n);
        System.out.println(s);
        sc.close();
    }
    static int findSum(int n){
        if(n==1) return 1;
        return findSum(n-1)+n;
    }
}
