package oops.ExceptionHandling.Video;

import java.io.IOException;

public class ThrowsExample2 {
	void m() throws IOException{
		throw new IOException("Device Error!!");
	}
	void n() throws IOException{
		m();
	}
	void p() {
		try{
			n();
		}catch(Exception e) {
			System.out.println(e.getMessage() + " Exception handled.");
		}
	}
	public static void main(String[] args) {
	ThrowsExample2 obj = new ThrowsExample2();
	obj.p();
	System.out.println("Code continues.");
	}

}
