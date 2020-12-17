package oops.Constructors;

class Boxx {
	double height;
	double width;
	double depth;
	
	//constructor used when all dimensions are specified:
	Boxx(double height,double width,double depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	//constructor used when no dimensions are specified:
	Boxx(){
		height = -1;
		width = -1;
		depth = -1;
	}
	//constructor used when cube is created:
	Boxx(double side){
		height = width = depth = side;
	}
	//calculate and return volume:
	double volume() {
		return width*height*depth;
	}
}

public class ConstructorsOverloading {
	public static void main(String[] args) {
		Boxx b1 = new Boxx(10,15,20);
		System.out.println("Volume of box 1 = "+b1.volume());
		Boxx b2 = new Boxx();
		System.out.println("Volume of box 2 = "+b2.volume());
		Boxx b3 = new Boxx(4);
		System.out.println("Volume of Cube = "+b3.volume());
	}
}