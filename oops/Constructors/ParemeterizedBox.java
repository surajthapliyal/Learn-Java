package oops.Constructors;

public class ParemeterizedBox {
	double width;
	double height;
	double depth;
	
	ParemeterizedBox(double width,double height,double depth){
		System.out.println("Constructor is working :");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume() {
		return width*height*depth;
	}
}
