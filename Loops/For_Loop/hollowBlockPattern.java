package Loops.For_Loop;

import java.util.Scanner;

public class hollowBlockPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==row){
                    System.out.print("* ");
                }else if(j==1 || j==col){
                    System.out.print("* ");
                }else{  
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
