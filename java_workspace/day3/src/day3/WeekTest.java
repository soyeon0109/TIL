package day3;

import java.util.Calendar;

public class WeekTest {

	public static void main(String[] args) {
		Week today = null;
		System.out.println(today);
		//System.out.println(today.name());
		
		//오늘 무슨 요일? 
		java.util.Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
			
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		}
		System.out.println(today);
	}

}
