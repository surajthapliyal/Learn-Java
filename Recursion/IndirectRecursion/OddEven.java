package Recursion.IndirectRecursion;

public class OddEven {
	static int n = 1;
	public static void main(String[] args) {
		odd();
	}
	static void odd() {
		if(n<=10) {
			System.out.print((n+1)+" ");
			n++;
			even();
		}
		return;
	}
	static void even() {
		if(n<=10) {
			System.out.print((n-1)+" ");
			n++;
			odd();
		}
		return;
	}
}
