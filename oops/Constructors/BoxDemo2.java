package oops.Constructors;

public class BoxDemo2 {

	public static void main(String[] args) {
		ParemeterizedBox mybox1 = new ParemeterizedBox(10,15,20);
		ParemeterizedBox mybox2 = new ParemeterizedBox(25,30,35);
		
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of Box 1 = " + vol);
		
		vol = mybox2.volume();
		System.out.println("Volume of Box 2 = " + vol);

	}

}
