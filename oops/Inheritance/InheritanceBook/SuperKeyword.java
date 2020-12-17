package oops.Inheritance.InheritanceBook;

class Box2 {
	private double width;
	private double height;
	private double depth;

	// Construct clone of an object:
	Box2(Box2 ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// contructor used when all dimensions are specified:
	Box2(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// contructor when no dimensions are specified:
	Box2() {
		width = height = depth = -1;
	}

	// constructor when cube is created:
	Box2(double side) {
		width = height = depth = side;
	}

	double volume() {
		return width * height * depth;
	}
	void showDim() {
		System.out.println("Widht = "+width);
		System.out.println("Height = "+height);
		System.out.println("Depth = "+depth);
	}
}

//here box to extended to include weight :
class BoxWeight2 extends Box2 {
	double weight; // weight of box

	// default contructor:
	BoxWeight2() {

	}

	// constructor when all sides are given:
	BoxWeight2(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	// constructor when cube is created:
	BoxWeight2(double side, double weight) {
		super(side);
		this.weight = weight;
	}

	// contructor when cloning an object:
	BoxWeight2(BoxWeight2 ob) {
		super(ob);
		weight = ob.weight;
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		BoxWeight2 mybox1 = new BoxWeight2(10, 20, 15, 34.3);
		BoxWeight2 mybox2 = new BoxWeight2(2, 3, 4, 0.076);
		BoxWeight2 mybox3 = new BoxWeight2(); // default
		BoxWeight2 mycube = new BoxWeight2(3, 2);
		BoxWeight2 myclone = new BoxWeight2(mybox1);

		double vol;
		vol = mybox1.volume();
		System.out.println("Vol of mybox1 = " + vol);
		System.out.println("Weight os mybox1 = " + mybox1.weight);
		mybox1.showDim();
		System.out.println();

		vol = mybox2.volume();
		System.out.println("Vol of mybox2 = " + vol);
		System.out.println("Weight of mybox2 = " + mybox2.weight);
		mybox2.showDim();
		System.out.println();

		vol = mybox3.volume();
		System.out.println("Vol of mybox3 = " + vol);
		System.out.println("Weight of mybox3 = " + mybox3.weight);
		mybox3.showDim();
		System.out.println();

		vol = myclone.volume();
		System.out.println("Vol of myclone = " + vol);
		System.out.println("Weight of myclone = " + myclone.weight);
		myclone.showDim();
		System.out.println();
		
		vol = mycube.volume();
		System.out.println("Vol of mycube = "+vol);
		System.out.println("Weight of myclone = "+myclone.weight);
		mycube.showDim();
		System.out.println();
		
		
	}

}
