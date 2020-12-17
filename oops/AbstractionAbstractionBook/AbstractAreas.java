package oops.AbstractionAbstractionBook;

abstract class figure {
	double dim1;
	double dim2;

	figure(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	// abstract area method
	abstract double area();
}

class triangle extends figure {

	triangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	@Override
	double area() {
		System.out.println("Inside traingle area.");
		return dim1 * dim2 / 2;
	}

}

class rectangle extends figure {

	rectangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	@Override
	double area() {
		System.out.println("Inside rectangle area.");
		return dim1 * dim2;
	}

}

public class AbstractAreas {

	public static void main(String[] args) {
		triangle t = new triangle(10, 8);
		rectangle r = new rectangle(9, 5);
		figure figref;
		figref = t;
		System.out.println(figref.area());
		figref = r;
		System.out.println(figref.area());
	}

}
