package Packages.Random.copy;

import java.util.Random;

public class DiceProblem {

	public static void main(String[] args) {
		Random rand = new Random();
		int die1,die2;
		int tries = 0;
		System.out.println("Rolling two dices:");
		do {
			die1 = rand.nextInt(6)+1;
			die2 = rand.nextInt(6)+1;
			System.out.println(die1+" "+die2);
			tries++;
		}while(die1!=die2);
		System.out.println("It takes you "+tries+" tries to get same digits in both dices.");
	}

}
