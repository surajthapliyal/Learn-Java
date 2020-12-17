import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
        sc.close();
    }
    static void fib(int num){
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<num;i++){
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
//  0 1 1 2 3 5 8 13