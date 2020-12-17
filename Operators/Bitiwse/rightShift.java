package Operators.Bitiwse;

public class rightShift {
    public static void main(String[] args) {
        int a=15;  // binary = 1111
        int b= a>>2; // right shift two digit means vanish two digit from right and other shift other bits in right and place 0 in left side.
        //        |
        //        |------->how many digits to shift.                
        System.out.println(b);  // 1111--> 0011 --> 3    (value gets halved = 15/2=7[ground value taken] 7/2=3)
    }
}