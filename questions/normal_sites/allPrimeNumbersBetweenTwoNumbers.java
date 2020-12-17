import java.util.Scanner;

public class allPrimeNumbersBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num = ");
        int s = sc.nextInt();
        System.out.println("Enter last number = ");
        int e = sc.nextInt();
        for(int i=s;i<=e;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }
    static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
