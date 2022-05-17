package com.qa.main.day4.encapsulation;

public class BankDetails {
	
	// Bank Details is a class that will be used to make an object BankDetails 
	
	// Only time you should be using numbers (ints, floats, double) 
	// if you need to work out averages, add them together, sort by number
	
	private float balance;
	private String accountNumber; // 072739710 -> 72739710, use strings for text numbers
	private String userName;
	private String password;
	// private - Not accessible from outside of this class
	
	// Constructor - Right click > source > generate Constructor using fields
	public BankDetails(float balance, String accountNumber, String userName, String password) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.password = password;
	}
	
	// Encapsulation is used to add methods and functionality to restrict 
	// getting and setting the data of our objects. Variables should be private 
	// By adding getters (retrieve data) and setters (update data)

	// Anyone 'should' be able to see your balance
	public float getBalance() {
		return balance;
	}

	
	public void setBalance(float balance) {
		
		// If balance is changed to more than 100 do something 
		if(balance > 100) {
			System.out.println("hmm.. suspicsious..");
			return;
		} else {
			this.balance = balance;
		}
		
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	// Add a password check to this
	public String getPassword(String passCode) {
		
		if(passCode == "mango") {
			return password;
		} else {
			return "incorrect passcode";
		}
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	
	
	
	

}
