package com.qa.main.day2.iteration;

public class Exercises {
	
	public static void flowchartExercise() {
		
		for(int a = 100; a < 200; a++) {
			System.out.println(a);
		}
		
		// Prints out 1 - 10, 10 times 
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(j); // 1 - 10 
			}
			System.out.println("internal loop finished"); 
		}
		System.out.println("After loop!");
		
		// Prints out 1 - 10 as many times as the value of that number, 
		// 1,2,2,3,3,3,4,4,4,4..
		
		for(int i = 1; i <= 10; i++) {
//			System.out.println(i); // 1 - 10 
			for(int x = 1; x <= i; x++) {
				System.out.println(i);
				System.out.println(x);
			}
			System.out.println("=============");
		}
		
	}
	
	public static void coins(float cost, float moneySpent) {
		
		// Takes in a cost of an item and how much a customer spent on said item
		// It will print out all of the change they recieve, in their coinage
		
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int two = 0;
		int one = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		// how much change the customer is owed
		float change = moneySpent - cost;
		
		while(change >= 50) {
			fifty++; // add one fifty pound note
			change -= 50;
		}
		
		while(change >= 20) {
			twenty++;
			change -= 20;
		}
		
		while(change >= 10) {
			ten++;
			change -= 10;
		}
		
		while(change >= 0.01f) {
			onePence++;
			change -= 0.01f;
		}
		
		System.out.println("Fifty Pound notes: " + fifty);
		System.out.println("Twenty Pound notes: " + twenty);
		System.out.println("Ten Pound notes: " + ten);
		
	}

}
