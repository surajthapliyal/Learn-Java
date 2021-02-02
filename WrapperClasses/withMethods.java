package WrapperClasses;

public class withMethods {
    public static void main(String[] args) {
        // here we are sending int value to a method which is accepting it as 
        // Integer , so it is auto autoboxing and then it is giving us back
        // int value , so it is autounboxing and then this value is getting stored to
        // Integer type variable i , so it again autoboxing :


        Integer i = automatic(123);     //auto-boxing

        System.out.println(i);
    }

    static int automatic(Integer i){
        return i;           //auto-unbox
    }
}
