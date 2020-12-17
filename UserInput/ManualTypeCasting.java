package UserInput;

public class ManualTypeCasting {
    public static void main(String[] args) {
        double d = 3.14235;
        int num = (int) d;
        System.out.println(d);
        System.out.println(num);

        int a = 97;
        char ch = (char) a;
        System.out.println(a);
        System.out.println(ch); // will print ASCII character
    }
}