package Operators.Bitiwse;
public class and {
    public static void main(String[] args) {
        int a = 5;  // binary 5 = 101
        int b = 4;  // binary 4 = 100
        int c = a & b; // convert a and b to binary and if both bit is same then give 1 otherwise 0
        System.out.println(c);  // 101 & 100  = 100 --> 4
    }
}