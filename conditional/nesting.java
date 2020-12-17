package conditional;

public class nesting {
    public static void main(String[] args) {
        int a=7452,b=6543,c=2345;
        if (a>b) {
            if(a>c){
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }
        else {
            if (b>c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}