package oops.ExceptionHandling.Video;

public class FunctionExampleException {

	public static void main(String[] args) {
		
		try{
			fun2();
//		}catch(Exception e)  //top exception class , it is not good for fine tuning of EH.
			//if any of the catch catches the exception object then other cathces wont execute.
		}catch(ArithmeticException e){	
			System.out.println("Handled with Arithmetic Exception");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index should be in the range of 0 to size of the array.");
		}catch(IllegalArgumentException e) {
			System.out.println("Check your casting Carefully!!!!");
		}finally {	//this will run despite of exception catching.
			System.out.println("Sorry for the inconvinience. :)");
		}
				
		System.out.println("Other code will execute!!!!");
	}
	static void fun1() {
		int a = 5;
		int b = 0;
		int c = a / b;
		System.out.println(c);
	}
	static void fun2() {
		int a[] = new int[5];
		System.out.println(a[6]);
	}
	
}
