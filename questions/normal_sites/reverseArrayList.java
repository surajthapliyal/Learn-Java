package questions.normal_sites;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Enter elements for the array : ");
        for(int i=0;i<size;i++){
            a.add(sc.nextInt());
        }

        System.out.println("Entered array = "+a);

        ArrayList<Integer> reversed = new ArrayList<>();
        for(int i=a.size()-1;i>=0;i--){
            reversed.add(a.get(i));
        }

        System.out.println("Reversed array = "+reversed);
        sc.close();
    }
}
