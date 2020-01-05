package com.jbc.springwork;

public class BaseballCoach implements Coach {
//	define private field for dependency
	private FortuneService fortuneService;
//	Define Constructor for DI
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on Batting Every Day";
	}

	@Override
	public String getDailyFortune() {
//		use fortuneService to get Fortune
		   return fortuneService.getFortune();
	}
}