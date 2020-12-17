package oops.Polymorphism;

class Figure {
	double dim1;
	double dim2;

	Figure(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	double area() {
		System.out.println("Area of Figure is undefined");
		return 0;
	}
}

class Rectangle extends Figure {
	Rectangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	double area() {
		System.out.println("Inside Rectangle Area.");
		return dim1 * dim2;
	}
}

class Triangle extends Figure {
	Triangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	double area() {
		System.out.println("Inside Triangle Area.");
		return dim1 * dim2 / 2;
	}
}

public class FindAreas {

	public static void main(String[] args) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);

		Figure ref;
		ref = r;
		System.out.println("Area is : " + ref.area());
		ref = t;
		System.out.println("Area is : " + ref.area());
		ref = f;
		System.out.println("Area is : " + ref.area());
	}

}
