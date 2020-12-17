package oops.Inheritance.InheritanceBook;

public class InstanceOf {

	public static void main(String[] args) {
		String s = new String("Hello");
		System.out.println(s instanceof String);
		
		if(s instanceof String) {
			System.out.println("YES");
		}else {
			System.out.println("No");
		}
		
		Box dabba = new Box();
		BoxWeight bhari = new BoxWeight();
		
		System.out.println(dabba instanceof Box);
		System.out.println(bhari instanceof BoxWeight);
		System.out.println(bhari instanceof Box); 			//BoxWeight is child of Box so indirectly instance of Box
		
		
	}

}
