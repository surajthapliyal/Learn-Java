package oops.Constructors;

public class NoArgumentsConstructor {
    int a;
    NoArgumentsConstructor(){
        a=5; //initializing value
    }
    public static void main(String[] args) {
        NoArgumentsConstructor object = new NoArgumentsConstructor();
        System.out.println(object.a);
    }
}