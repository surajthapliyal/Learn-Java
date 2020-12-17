package Packages.Random;
import java.util.Random;
public class HeadsAndTails {

	public static void main(String[] args) {
		Random rand = new Random();
		int r = rand.nextInt(2);
		if(r==0) {
			System.out.println("Heads");
		}else {
			System.out.println("Tails");
		}
	}

}
