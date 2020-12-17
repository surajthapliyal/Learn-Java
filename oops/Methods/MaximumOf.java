package oops.Methods;

public class MaximumOf {
    public static void main(String[] args) {
        int firstNumber = 34;
        int secondNumber = 23;
        int result = maxOf(firstNumber,secondNumber);
        System.out.println("Greater number = "+result);
    }
    static int maxOf(int a,int b){
        if(a>b){
            return a;
        } else{
            return b;
        }
    }
}