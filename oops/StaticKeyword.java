package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
    public static void main(String[] args) {
        A objA=new A();
        // A.B objB=objA.new B();      //obj of B is declared without import

        // A.C objC=new A.C();         //obj of C is declared without import

        B objB=objA.new B();            //obj of B is declared with import
        C objC=new A.C();               //obj of C is declared with import
    }
}