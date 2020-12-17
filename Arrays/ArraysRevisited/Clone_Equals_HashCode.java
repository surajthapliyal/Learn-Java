package Arrays.ArraysRevisited;

public class Clone_Equals_HashCode {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		int b[] = a.clone();
		for(int each : b) {
			System.out.print(each+" ");
		}
		System.out.println();
		if(a == b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");	//Will print No beacuse elments are same not the refference
		}
		if(a.equals(b)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");	
		}
		System.out.println(a.hashCode());
	}

}
