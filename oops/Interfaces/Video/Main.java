package oops.Interfaces.Video;

public class Main {

	public static void main(String[] args) {
		Person p = new Person(); // have acces to all members of student and youtuber interface members
		p.study();
		p.makeVideo();
		p.editVideo();
		p.uploadVideo();

		System.out.println();

		Youtuber y = p; // only have youtubers members access only

		//or
		
		//		Youtuber y = new Person();
		y.makeVideo();
		y.editVideo();
		y.uploadVideo();
		
		System.out.println();
		
		Student s = p; // only have student members access only
		s.study();
	}

}
