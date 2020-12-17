package oops.ExceptionHandling.Video;

import java.io.IOException;

public class throwsExample {

	public static void main(String[] args) {
		try {
			fun1();
		} catch (IOException e) {
		}
	}

	static void fun1() throws IOException {
		System.out.println("Hello");
		throw new IOException();		
	}
}
