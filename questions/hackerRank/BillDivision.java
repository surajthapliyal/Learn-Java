package questions.hackerRank;
import java.util.Scanner;

public class BillDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        int bills[] = new int[items];
        int didNotEat = sc.nextInt();
        int sum = 0;
        for(int i=0;i<items;i++){
            bills[i] = sc.nextInt();
            if(i != didNotEat)
                sum+=bills[i];
        }
        int pay = sum / 2;
        int annaShare = sc.nextInt();
        if(annaShare > pay){
            System.out.println(annaShare-pay);
        }else if(annaShare == pay){
            System.out.println("Bon Appetit");
        }
        sc.close();
    }
}
