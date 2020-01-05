package com.jbc.springwork;

public class CircketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		   return "Time to Play Cricket it takes Hours & Days";
	}

	@Override
	public String getDailyFortune() {
			return null;
	}

}