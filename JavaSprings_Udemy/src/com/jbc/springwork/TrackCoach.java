package com.jbc.springwork;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
			return "Run a Hard 5k";
	}

	@Override
	public String getDailyFortune() {
			return null;
	}

}