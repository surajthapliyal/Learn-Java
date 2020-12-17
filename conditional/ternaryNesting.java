package conditional;

public class ternaryNesting {
    public static void main(String[] args) {
        int a=1,b=2,c=3;
        int result;
        result = a>b ? a>c ? a : c :b>c ? b : c ; 
        System.out.println(result); 
    }
}