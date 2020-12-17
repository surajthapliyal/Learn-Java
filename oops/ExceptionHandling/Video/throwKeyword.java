package oops.ExceptionHandling.Video;

public class throwKeyword {

	public static void main(String[] args) {
		fun1();
	}
	static void fun1() {
		boolean isDanger = true;
		if(isDanger) {
			//this will show exception no matter what.
			throw new ArrayIndexOutOfBoundsException("Danger was coming.");
		}
	}

}
