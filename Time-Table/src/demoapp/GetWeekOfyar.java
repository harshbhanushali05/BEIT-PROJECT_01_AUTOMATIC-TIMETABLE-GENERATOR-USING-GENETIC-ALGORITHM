package demoapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetWeekOfyar {

	public static String getDatesBasedOnWeek(String currentDate) {
		// TODO Auto-generated method stub
		
		String input = currentDate;
		String format = "MM/dd/yyyy";

		SimpleDateFormat df = new SimpleDateFormat(format);
		Date date=null;
		try {
			date = df.parse(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println(week);
		
		
		


		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		Calendar cal4 = Calendar.getInstance();
		Calendar cal5 = Calendar.getInstance();
		cal1.set(Calendar.WEEK_OF_YEAR, week);
		cal2.set(Calendar.WEEK_OF_YEAR, week);
		cal3.set(Calendar.WEEK_OF_YEAR, week);
		cal4.set(Calendar.WEEK_OF_YEAR, week);
		cal5.set(Calendar.WEEK_OF_YEAR, week);
		
		cal1.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		cal2.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		cal3.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		cal4.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
		cal5.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		String dates=sdf.format(cal1.getTime())+","+sdf.format(cal2.getTime())+","+sdf.format(cal3.getTime())+","+sdf.format(cal4.getTime())+","+sdf.format(cal5.getTime());
  return dates;
	}

}
