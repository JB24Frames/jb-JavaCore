package org.jb.ikmonlinetest;

import java.time.LocalTime;
import java.util.Calendar;

public class TimeOuptut {

	public static void main(String[] args) {
//		 output 15:08:03 which one statement do this?
		System.out.println(String.format("Local time: %1$tB", Calendar.getInstance())); // Month 
		System.out.println(String.format("Local time: %tT", Calendar.getInstance())); // below 3 give same time format like 15:08:03;
		System.out.println(String.format("Local time: %tT", LocalTime.now()));
		System.out.println(String.format("Local time: %tH:%tM:%tS", LocalTime.now(), LocalTime.now(),LocalTime.now()));
//		System.out.println(String.format("Local time: %tT", Calendar.getInstance().toString()));; Exception like illegal formatting


	}

}
