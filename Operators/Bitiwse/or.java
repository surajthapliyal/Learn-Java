package Operators.Bitiwse;

public class or {
    public static void main(String[] args) {
        int a = 10; // binary = 1010
        int b = 13; // binary = 1101
        int c = a | b;  // if one digit is 1 then it return 1 , if both is 0 then it return 0
        System.out.println(c);  // 1010 | 1101 = 1111 --> 15
    }
}