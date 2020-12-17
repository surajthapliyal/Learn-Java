package UserInput;

public class AutomaticTypeCasting {
    public static void main(String[] args) {
        byte x = 4;
        int y=x;
        System.out.println(x);
        System.out.println(y);

        char ch = 'a';
        int a = ch;  //will print ASCII value
        System.out.println(ch);
        System.out.println(a);

        int num = 23;
        float f = num;
        System.out.println(num);
        System.out.println(f);
    }
}