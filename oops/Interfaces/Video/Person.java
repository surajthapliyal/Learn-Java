package oops.Interfaces.Video;

public class Person implements Student , Youtuber{

	@Override
	public void study() {
		System.out.println("Person is Studying.");
	}

	@Override
	public void makeVideo() {
		System.out.println("Person is making a Youtube Video.");
	}

	@Override
	public void editVideo() {
		System.out.println("Person is editing Youtube Video.");
	}

}
