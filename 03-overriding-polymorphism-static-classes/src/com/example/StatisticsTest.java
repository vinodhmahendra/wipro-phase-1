package com.example;

public class StatisticsTest {

	public static void main(String[] args) {
		Statistics stats = new Statistics();
		
		float avg0 = stats.average();
		float avg1 = stats.average(100);
		float avg2 = stats.average(100,200);
		
		System.out.println("Average with no parameters: " + avg0);
		System.out.println("Average of 100 is: " + avg1);
		System.out.println("Average of 100 and 200 is: " + avg2);
	}

}
