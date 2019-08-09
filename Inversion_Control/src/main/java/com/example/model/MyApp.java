package com.example.model;

public class MyApp {

	public static void main(String[] args) {
		// never use direct implmentation
		// always use interface as the contract
		Coach bc = new BaseballCoach();
		
		//Coach tc = new TrackCoach();
		bc = new TrackCoach();
		
		System.out.println(bc.getDailyWorkout());
		//System.out.println(tc.getDailyWorkout());
	}

}
