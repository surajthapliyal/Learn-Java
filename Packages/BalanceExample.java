package Packages;		//this is the package where we have created this class.

class balance {
	String name;
	double bal;

	balance(String name, double bal) {
		this.name = name;
		this.bal = bal;
	}

	void show() {
		if (bal > 0) {
			System.out.print("---->");
			System.out.println(name + " : $" + bal);
		}
	}
}

public class BalanceExample {

	public static void main(String[] args) {
		balance current[] = new balance[3];
		current[0] = new balance("K.J. Fleming.", 123.23);
		current[1] = new balance("Will Tell", 157.02);
		current[2] = new balance("Tom Jackson", -12.33);
		for (int i = 0; i < 3; i++) {
			current[i].show();
		}
	}

}
