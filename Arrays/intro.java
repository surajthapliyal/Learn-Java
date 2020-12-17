package Arrays;

public class intro {
    public static void main(String[] args) {
        //without initialized array example:
        int[] marks=new int[5];   //by default array all elements initialized to 0
        System.out.println(marks[2]);  //run time error(exception) if index>=size

        //initialized array example :
        int[] numbers={1,2,3,4,5,6,7,8,9};
        System.out.println(numbers[1]);
    }
}