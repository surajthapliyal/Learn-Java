package Operators.Assignment;

public class use {
    public static void main(String[] args) {
        int a=4;
        a+=5;  // a=a+5 --> a=4+5
        System.out.println(a);  // 5+4=9.
        a-=2;
        System.out.println(a); // 9-2=7
        a*=2;
        System.out.println(a); // 7*2=14
        a/=2;
        System.out.println(a);  // 14/2=7
        a%=2;
        System.out.println(a); //7%2=1 (remainder)
        int b=4;
        b>>=2;
        System.out.println(b);  // 4/2=2 2/2=1 .
        int c=4;
        c<<=2;
        System.out.println(c);  // 4*2=8 8*2=16
        // c&=2;  // c=c&2
        c|=2; // c=c|2
        System.out.println(c); 
    }
}