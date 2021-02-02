package Recursion.practice;

public class p {
    static int steps = 0;
    public static void main(String[] args) {
        System.out.println(findPower(3,7));
        System.out.println("Total steps = " + steps);
    }
    static int findPower(int base , int exp){
        steps++;
        if(exp == 0){
            return 1;
        }
        return findPower(base, exp - 1)  *  base; 
    }
}
