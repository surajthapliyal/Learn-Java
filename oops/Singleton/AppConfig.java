package oops.Singleton;

public class AppConfig {
	private AppConfig() {
		// private default constructor
	}

	private static AppConfig obj = null; // singleton object is null to save memory if not needed

	public static AppConfig getInstance() {
		if (obj == null) {
			obj = new AppConfig(); // if singleton object is needed then it will get created
		}
		return obj; // returns the singleton obj
	}
}