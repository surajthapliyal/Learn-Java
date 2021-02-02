// for every primitive type we have its own wrapper class :
/*
    int - Integer               float - Float           short - Short
    char - Character            double - Double
    boolean - Boolean           long - Long
*/
package WrapperClasses;

public class mainClass {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(12);        //boxing
        Integer i1 = Integer.valueOf("1234");
        Integer binary = Integer.valueOf("10110100101", 2);     //here 2 is base(radix as name in function conv.) .
        System.out.println("binary number = " + binary);
        int i2 = i.intValue();                  //unboxing
        int i3 = Integer.parseInt("123");

        System.out.println(i+" "+i1+" "+i2+" "+i3);


        Integer autobox = 1212;              //auto-boxing
        int autounbox = autobox;             //auto-unboxing
        System.out.println(autobox + " " + autounbox);



    }
}
