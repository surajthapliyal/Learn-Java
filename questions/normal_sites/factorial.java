import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println("Factorial = " + ans);

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
