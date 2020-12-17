package questions.hackerRank;

import java.util.Scanner;

public class breakingTheRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int scores[] = new int[size];
        for(int i=0;i<size;i++){
            scores[i] = sc.nextInt();
        }

        int max = scores[0];
        int maxCounter = 0;
        int min = scores[0];
        int minCounter = 0;
        for(int i=0;i<size;i++){
            if(scores[i] > max){
                max = scores[i];
                maxCounter++;
            }if(scores[i] < min){
                min = scores[i];
                minCounter++;
            }
        }
        System.out.println(maxCounter+" "+minCounter);
    }
}
