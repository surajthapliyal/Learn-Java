package oops.Inheritance.InheritanceBook;

class Box {
	double width, height, depth;

	// Construct clone of an object:
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// contructor used when all dimensions are specified:
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// contructor when no dimensions are specified:
	Box() {
		width = height = depth = -1;
	}

	// constructor when cube is created:
	Box(int side) {
		width = height = depth = side;
	}

	double volume() {
		return width * height * depth;
	}
}

//here box to extended to include weight :
class BoxWeight extends Box {
	double weight; // weight of box

	BoxWeight(){
		
	}
	// constructor for BoxWeight:
	BoxWeight(double width, double height, double depth, double weight) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.weight = weight;
	}
}

public class MorePracticalExample {

	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);

		double vol;

		vol = mybox1.volume();
		System.out.println("Volume of mybox1 = "+vol);
		System.out.println("weight of mybox1 = "+mybox1.weight);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 = "+vol);
		System.out.println("weight of mybox2 = "+mybox2.weight);
	}

}
