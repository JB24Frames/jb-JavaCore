package org.javaiw.misc;

import java.util.Calendar;
import java.util.Date;

public class CalenderMain {

	public static void main(String[] args) {
		System.out.println("Calendar a Factory Desing Pattern use of Factory Methods");
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		System.out.println("Day of Month --> " +calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of Week --> " +calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Week of Month --> " +calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Week of Year --> " +calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Day of Year --> " +calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println("AM PM --> " +calendar.get(Calendar.AM_PM));
		System.out.println("AM --> " +calendar.get(Calendar.AM));
		System.out.println("PM --> " +calendar.get(Calendar.PM));
		System.out.println("Year --> " +calendar.get(Calendar.YEAR));
		calendar.set(Calendar.MONTH, Calendar.APRIL);
		calendar.set(Calendar.DATE, 24);
		calendar.set(Calendar.YEAR, 2020);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
//		System.out.println("calendar object: -->" +calendar);
		String year  = String.format("%1$td \t %1$tc \t %2$ty \t %2$tc \t %2$tm \n %2$tm \t %2$td \t %2$ty \t %2$tT" , dt, calendar);
		System.out.println("Default Year after Formatting: --> " +year);
		/*Format Specifiers: %t means date & Time, the next suffix represented by d-date, Month-m, year-y , where c is Calendar
		 * 1$ , 2$ means retrieve what ever data you need from the successive arguments provided ex: dt, calendar */ 
		System.out.println("<<--------------------------------->>");
		System.out.println(dt);
		System.out.println("getDay(): --> " +dt.getDay()); // Day 6 is 0-6 means 7th day Sunday
		System.out.println("toString() -->" +dt.toString());
		System.out.println("getTimeZoneOffser() --> " +dt.getTimezoneOffset());
		System.out.println("hasCode() --> " +dt.hashCode());
		System.out.println("<<  Converting Calender obbjects to Date Object  >>");
		calendar.set(Calendar.MONTH, Calendar.APRIL);
		Date calMonth = calendar.getTime();
		System.out.println("Caldenar obj sets Month to APRIL and converting to Date: --> " +calMonth);
		calendar.set(Calendar.MONTH, Calendar.DECEMBER);
		calendar.set(Calendar.DATE, 24);
		calendar.set(Calendar.YEAR, 2020);
		Date calDate = calendar.getTime();
		System.out.println("Converting Caldenar obj that sets Month/Date/Year to December/24/2020 --> " +calDate);
		String yearNew  = String.format("%1$td %1$tc %2$ty \n %2$tc" , calDate, calendar);
		System.out.println("New Year Setted after Formatting: --> " +yearNew);
//		calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
//		calendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 26);
		System.out.println("<<--------------------------------->>");
		int x = 10;
		double d = 10.239;
		String str = "Bobby";
		System.out.println("Formating String--> " +String.format("%8d%10.2f%10sChowdary", x, d, str));
		/*8 d means 8 places default from Right side to Left it encrypts 8 places, 10.2 where2 means after . or decimal values 
		 * should round of to 2 includes the space provided, Below is for Left hand side encrypting , it functions similar to th eabove but writes from Left to right*/		
		System.out.println("Formating String--> " +String.format("%-8d%-10.2f%-10sChowdary", x, d, str));
		
	}

}
