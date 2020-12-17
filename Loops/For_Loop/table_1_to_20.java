package Loops.For_Loop;

public class table_1_to_20 {
    public static void main(String[] args) {
        int n=0;
        for(int j=1;j<=10;j++){
            int prod=0;
            n+=1;
            for(int i=1;i<=20;i++)
            {
                prod+=n;
                System.out.print(" "+prod+" ");
            }
            System.out.println();
    }
    }
}