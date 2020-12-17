import java.util.Scanner;

public class calculate_ncr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ans = fact(n)/(fact(r)*fact(n-r));
        System.out.println("nCr = "+ ans);
        sc.close(); 
    }
    static int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
}
