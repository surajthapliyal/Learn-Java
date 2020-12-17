package questions.normal_sites;

class Person{
	public static int count = 0;
	Person(){
		Person.count++;
	}
	public static void printCount() {
		System.out.println("Total objects created = "+Person.count);
	}
}

public class CountOfObjects {

	public static void main(String[] args) {
		Person.printCount();
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person.printCount();
	}

}
