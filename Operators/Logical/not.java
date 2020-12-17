package Operators.Logical;

public class not {
    public static void main(String[] args) {
        int std=11;
        if (!(std==10 || std==12)) {
            System.out.println("You cannot give board exams.");
        }
    }
}