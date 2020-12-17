package questions.hackerRank;

import java.util.Scanner;

public class gradingStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int grade : a){
            System.out.println(grade < 38 || grade % 5 < 3 ? 
                                    grade :
                                    grade + (5 - (grade % 5)));
        }
    }
}
