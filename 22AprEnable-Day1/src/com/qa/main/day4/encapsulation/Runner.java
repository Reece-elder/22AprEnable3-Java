package com.qa.main.day4.encapsulation;

public class Runner {
	
	public static void main(String[] args) {
		
		BankDetails user1 = new BankDetails(100, "837639072028", "jSmith32", "1234abcd!");
		
		// Hacker has got into main, and is able to system out password 
		System.out.println(user1.getPassword("mango")); // getPassword() - returns our password
		
		// Any user can update and change their balance to any value
//		user1.setBalance() = 100000;
		user1.setBalance(100000); 
		System.out.println(user1.getBalance());
		
		// The user goes to a cashpoint and wants to take out £20 
		user1.setBalance(80); // because the balance is private.. 
		
	}


}
