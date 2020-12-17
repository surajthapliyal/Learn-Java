package oops.Interfaces.Video;

public interface Youtuber extends VideoEditor { // interface
	void makeVideo(); // are by default public and abstract

	default void uploadVideo() {
		System.out.println("Person is Uploading Video."); // to create concrete methods in interface we use default
															// keyword , these methods can be override too.
	}
}
