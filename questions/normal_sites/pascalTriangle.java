import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        printTriangle(size);
        sc.close();
    }
    static void printTriangle(int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(j<=i){
                    System.out.print(fact(i)/(fact(j)*fact(i-j))+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
