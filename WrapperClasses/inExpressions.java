package WrapperClasses;

public class inExpressions {
    public static void main(String[] args) {
        Integer i1 = 100;           //auto boxing
        System.out.println(i1);
        i1++;   //first autoUnboxing happen then ++ performs on int after this reboxing
        // happens that means int gets back converted to Integer.
        System.out.println(i1);



        Integer i2 = i1 + (i1 / 3);
        // here i1 is unboxed and then the result is evaluated 
        // after which the result is reboxed and assigned to i2.
        System.out.println(i2);
        
        
        Integer i3 = 12;
        Double d1 = 34.1;

        // same as here : first unbox , then result evaluate then rebox it:
        d1 = d1 + i3;
        System.out.println(d1);
    }
}