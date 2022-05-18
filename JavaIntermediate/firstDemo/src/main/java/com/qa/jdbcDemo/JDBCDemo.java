package com.qa.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo {
	
	// Create some variables that our JDBC will use 
	// final - this variable can never change, once set we can't modify this value
	// final variable names should be ALL_CAPS_USE_UNDERSCORES
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost:3306/cafe";
	final String USER = "root";
	final String PASSWORD = "root";
	
	// There are 'scrapers' on github that go through repos and find 'passwords' connected 
	// to this repos email, and can be used to steal your data 
	
	// import - Connection from java.sql
	Connection conn;
	
	
	//Method to connect to our database
	public Connection connect() {
		// try - contains the code we are attempting to do, used when there is something that can go wrong
		try {
			Class.forName(JDBC_DRIVER); // Finding our JDBC Driver to use
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("Connected to Database!");
		} catch (Exception e) { // catch {contains what to do if there is an error in the try{} }
			e.printStackTrace(); 
			// catch method takes in an Exception, excepetion is an object that is an error
			// print the details of this error
		}
		return conn; // return the connection we have created
	}

	
	
	
	
	
	
	
	
}
