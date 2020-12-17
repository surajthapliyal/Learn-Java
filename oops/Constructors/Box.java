package oops.Constructors;

public class Box {
	double width;
	double height;
	double depth;
	
	Box(){
		System.out.println("Constructor is working :");
		width = 20;
		height = 15;
		depth = 10;
	}
	
	double volume() {
		return width*height*depth;
	}
}
