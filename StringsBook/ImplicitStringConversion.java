package StringsBook;

class box {
	double width;
	double height;
	double depth;

	box(double width, double height, double depth) { // paremeterizedConstructor
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "Dimensions are : " + width + " by " + depth + " by " + height + ".";
	}
}

public class ImplicitStringConversion {

	public static void main(String[] args) {
		box b = new box(10, 15, 20);
		String s = "Box b = " + b;
		System.out.println("String = " + s);
	}
	/*
	 * whenever we print object toString() method gets automatically called or
	 * overrides so if we do not create own toString() method in the class and try
	 * to print object then it will give error.
	 */
}
