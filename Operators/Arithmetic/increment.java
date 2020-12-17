package Operators.Arithmetic;

public class increment {
    public static void main(String[] args) {
        int a = 23;
        System.out.println(a);
        int b = a++; // firstly it gets assigned and then gets incremented by 1
        System.out.println(b + " " + a);  
        int d = ++a; // incremented value gets assigned
        System.out.println(d + " " + a);
    }
}