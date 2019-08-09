package com.example.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring config file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the object but associate it with the interface instead.
		Coach trackCoach = context.getBean("TrackCoach", Coach.class);
		Coach baseballCoach = context.getBean("BaseballCoach", Coach.class);
		// test out 
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyWorkout());
		
		// close the context
		
		context.close();
		
	}

}
