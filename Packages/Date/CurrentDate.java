package Packages.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentDate = new Date();
		//for current date and time everything
		System.out.println(currentDate);
		//for current date and time only
		SimpleDateFormat dateAndTimeFormat = new SimpleDateFormat();
		System.out.println(dateAndTimeFormat.format(currentDate));
		//for current time only
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeFormat.format(currentDate));
		//for current date only
		SimpleDateFormat dateFormat= new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(dateFormat.format(currentDate));
		//current day
		SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
		System.out.println(dayOfTheWeekFormat.format(currentDate));
	}

}
