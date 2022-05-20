package com.qa.jdbcPetShopTwo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost:3306/petShop";
	final String USER = "root";
	final String PASSWORD = "root";
	
	Connection conn;
	
	// Connect method - connect to our DB
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
