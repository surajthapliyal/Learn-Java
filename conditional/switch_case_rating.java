package conditional;
import java.util.Scanner;
public class switch_case_rating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rating out of 5 : ");
        int r=sc.nextInt();
        switch(r) {
            case 1:
            case 2:
            System.out.println("Bad");
            break;
            case 3:
            System.out.println("Average");
            break;
            case 4:
            case 5:
            System.out.println("Good");
            break;
            default:
            System.out.println("Error rating");
            break;
        }
    }
}