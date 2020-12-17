package oops.Singleton;

public class MainClass {
	public static void main(String[] args) {
//        AppConfig obj = new AppConfig();		//cannot create objects as it is haing Private Constructor 
		AppConfig obj1 = AppConfig.getInstance(); // get singleton object and retuns it to obj1 refrence of AppConfig
													// class
		AppConfig obj2 = AppConfig.getInstance();
		AppConfig obj3 = AppConfig.getInstance();	// all of these refrence is having same single ton object 
	}
}