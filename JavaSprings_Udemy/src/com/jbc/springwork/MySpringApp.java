package com.jbc.springwork;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		System.out.println("MySpringApp Demo: ");
//		Loading the xml Config File into ApplicationContext.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Retrieve the Bean from the Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
//		Coach theCoach1 = context.getBean("myCoach1", Coach.class);
//		Coach cirCoach = context.getBean("cirCoach", Coach.class);
//		Call Methods on The Bean
		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(theCoach1.getDailyWorkout());
//		System.out.println(cirCoach.getDailyWorkout());
//		call new methods
		System.out.println(theCoach.getDailyFortune());
//		Close the context
		context.close();	

	}

}