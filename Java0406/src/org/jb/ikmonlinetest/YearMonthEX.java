package org.jb.ikmonlinetest;

import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class YearMonthEX {

	public static void main(String[] args) {
		YearMonth ym1 = YearMonth.now();
//	     YearMonth ym2 = YearMonth.of(2016, Month.FEBRUARY); 
//		if we set them to the given question we get as follows
	     YearMonth ym2 = YearMonth.of(2015, Month.SEPTEMBER);
//	     System.out.println("ym1 -->" +ym1 +" ym2--> " +ym2 +" ym3 -->" +ym3);
//	     System.out.println(ym1.until(ym2, ChronoUnit.MONTHS));
	     System.out.println(ym1.minus(Period.ofMonths(4)).getMonthValue());
//	     this above line will output 5 , is the answer
//	 	 System.out.println(ym1.until(ym2, null));
//	 	 System.out.println(ym2.compareTo(ym1));
//	 	 System.out.println(ym2.until(ym1, ChronoUnit.MONTHS));

	}

}
