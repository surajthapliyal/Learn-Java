package oops.Constructors;

class Dabba{
	double width,height,depth;
	
	//if no args in cons:
	Dabba(){
		width = height = depth = -1;
	}
	//if all args in cons:
	Dabba(double width,double height,double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	//cons when cube is created:
	Dabba(double side){
		width = height = depth = side;
	}
	//cons for making clone:
	Dabba(Dabba d){
		width = d.width;
		height = d.height;
		depth = d.depth;
	}
	
	//calculate and return volume of dabba:
	double volume() {
		return width * height * depth ;
	}
}

public class ObjectsAsParamtersInConstructors {

	public static void main(String[] args) {
		Dabba d1 = new Dabba(); 
		System.out.println("Volume of d1 = "+d1.volume());
		Dabba d2 = new Dabba(1,2,3);
		System.out.println("Volume of d2 = "+d2.volume());
		Dabba cube = new Dabba(7);
		System.out.println("Volume of cube = "+cube.volume());
		Dabba clone = new Dabba(d2);
		System.out.println("Volume of clone(d2) = "+clone.volume());
	}

}
