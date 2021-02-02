package Recursion.practice;

public class fp {

    static int steps = 0;
    public static void main(String[] args) {
        System.out.println(fastPower(3 , 7));
        System.out.println("Total steps = " + steps);
    }
    static int fastPower(int a , int b){
        steps++ ;
        if(b==0)    return 1;
        if(b%2==0)  return fastPower(a*a , b/2);
        else        return fastPower(a, b - 1) * a;
    }
}
