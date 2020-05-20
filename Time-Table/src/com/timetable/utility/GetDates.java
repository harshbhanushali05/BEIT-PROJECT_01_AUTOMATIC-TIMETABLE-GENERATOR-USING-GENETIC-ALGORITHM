package com.timetable.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GetDates {

	
		public String getCurrentWeekDates()
		{
			
		 Calendar now = Calendar.getInstance();

		    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
            String dates="";
		    String[] days = new String[7];
		    int delta = -now.get(GregorianCalendar.DAY_OF_WEEK) + 2; //add 2 if your week start on monday
		    now.add(Calendar.DAY_OF_MONTH, delta );
		    for (int i = 0; i < 7; i++)
		    {
		        days[i] = format.format(now.getTime());
		        dates=dates+days[i]+",";
		        now.add(Calendar.DAY_OF_MONTH, 1);
		    }
		    System.out.println(Arrays.toString(days));
		    return dates.substring(0, dates.length()-1);
		}
		
		
		
		
		public String getNextDates(String curDate)
		{
		 String nextDate = "";
	        try {
	        	 
	            Calendar today = Calendar.getInstance();
	            DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	            Date date = format.parse(curDate);
	            
	           
	            for(int i=1;i<=7;i++){
	            	 today.setTime(date);
	            today.add(Calendar.DAY_OF_YEAR, i);
	            nextDate =nextDate+format.format(today.getTime())+",";
	            
	            
	            }
	            
	        } catch (Exception e) {
	            
	        }
	        return nextDate.substring(0, nextDate.length()-1);
		}
		
		public String getPrevDates(String curDate)
		{
		 String nextDate = "";
	        try {
	        	 
	            Calendar today = Calendar.getInstance();
	            DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	            Date date = format.parse(curDate);
	            
	           
	            for(int i=7;i>=1;i--){
	            	 today.setTime(date);
	            today.add(Calendar.DAY_OF_YEAR, -i);
	            nextDate =nextDate+format.format(today.getTime())+",";
	            
	            
	            }
	            
	        } catch (Exception e) {
	            
	        }
	        return nextDate.substring(0, nextDate.length()-1);
		}
}

	


