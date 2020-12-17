package oops.ClassAndObjects;

public class BoxDemo {

	public static void main(String[] args) {
		/*Box mybox1;
		mybox1 = new Box();     
		Box mybox2;
		mybox2 = new Box(); */
		
		//can also be done like this : 
		
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		double vol;
		
		mybox1.setDim(10, 20, 15);
		System.out.println("Volume of Box 1 = "+mybox1.volume());
		
		mybox2.setDim(3, 6, 9);
		System.out.println("Volume of Box 2 = "+mybox2.volume());
	}

}
