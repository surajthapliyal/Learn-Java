package Operators.Arithmetic;

public class decrement {
    public static void main(String[] args) {
        int a = 10;
        int b = a--; // firstly it gets assigned and then gets decrement by 1
        System.out.println(b + " " + a);   //a = 9
        int c = --a; // decremented value gets assigned to c
        System.out.println(c + " " + a); // a=8
    }
}