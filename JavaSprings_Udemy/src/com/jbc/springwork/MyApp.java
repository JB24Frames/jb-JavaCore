package com.jbc.springwork;

public class MyApp {

	public static void main(String[] args) {
		System.out.println("Main Application MyApp:");
//		create Object
//		BaseballCoach bbCoach = new BaseballCoach();
//		Use Object
//		System.out.println(bbCoach.getDailyWorkout());
//		Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
		
		/*Coach theCoach = ()->{
			return "Spend 30 minutes Bating in BaseBall-Field";
			
		};
		System.out.println("Using Coach Interface:" +theCoach.getDailyWorkout());*/
		
	}

}
