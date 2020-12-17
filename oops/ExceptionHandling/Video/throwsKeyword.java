package oops.ExceptionHandling.Video;

public class throwsKeyword {

	public static void main(String[] args) {
		fun1();
	}
	static void fun1(){
		try{
			fun2();
		}catch(Exception e) {
			System.out.println(e.getMessage() + " occured.");
		}
	}
	static void fun2() throws ArithmeticException{
		boolean isDanger = true;
		if(isDanger) {
			//this will show exception no matter what.
			throw new ArrayIndexOutOfBoundsException("Danger was coming.");
		}
	}
}
