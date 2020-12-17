package oops.Constructors;

public class BoxDemo {

	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of Box 1 = " + vol);
		
		vol = mybox2.volume();
		System.out.println("Volume of Box 2 = " + vol);

	}

}
