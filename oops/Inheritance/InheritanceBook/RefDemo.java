package oops.Inheritance.InheritanceBook;

public class RefDemo {

	public static void main(String[] args) {
//		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);		//class defined in MorePracticle.java
//		Box plainbox = new Box();		//class defined in MorePracticle.java
		
		BoxWeight weightbox = new BoxWeight();		//step 1 for DC
		Box plainbox = weightbox;					//step 2 for DC
		
		double vol;
//		vol = weightbox.volume();
//		System.out.println("Volume of weightbox = "+vol);
//		System.out.println("weight of weightbox = "+weightbox.weight);

//		(Upcasting of Objects):
//		plainbox = weightbox;		//adding refrence of weightbox to plainbox
//		vol = plainbox.volume();
//		System.out.println("Volume of plainbox(with refrence of weightbox) = "+vol);
		/*following statement wont run as plainbox(with refrence of weightbox) dont have
		 * weight as a feild(because it is of Box class).
		 */
//		System.out.println("Weight of plainbox = "+plainbox.weight);
		
		
		
//		(DownCasting of Objects):
		BoxWeight weightbox2 = (BoxWeight) plainbox; //adding refrence of parent to child 		//step 3 for DC
		weightbox2.depth = 4;		//can acess all feilds as it contains every feild though it is child
		weightbox2.height = 5;		//changes to child will also change parents feilds(as it is reffered)
		weightbox2.width = 6;
		weightbox2.weight = 7;
		vol = weightbox2.volume();
		System.out.println("Volume of weightbox(with refrence of plainbox) = "+vol);
		System.out.println("Volume of plainbox = "+plainbox.volume());
	}

}
