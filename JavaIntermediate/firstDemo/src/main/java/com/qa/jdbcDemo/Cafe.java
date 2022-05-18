package com.qa.jdbcDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

// Serve a similar purpose to Garage, used for our methods
public class Cafe {
	
	// ArrayList<Vehicle>.. - Because our Database will be storing our data
	
	Statement stmt = null;  // import java.sql
	Connection conn = null;	// import java.sql
	
	JDBCDemo db = new JDBCDemo(); // making my object
	
	
	// making a method to add our drink to our database
	public void addDrink(Drink drink) {
		try {
			conn = db.connect();
			stmt = conn.createStatement(); // Making a line of communication to our db
			// What SQL query we are putting into our database
			String query = "INSERT INTO drinks(type, size, dairyFree, cost) VALUES('"+ drink.getType() + "', '"+ drink.getSize() +"', " + drink.isDairyFree()+ ", "+ drink.getCost()+");";
			System.out.println(query);
			stmt.executeUpdate(query); // pass in our SQL query into stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// Viewing the data in our database, but we want to view it in java 
	// SELECT * FROM drinks -> Give us all of our data.. convert it to Java language
	// Method to get one drink by id
	public Drink getDrinkById(int id) {
		try {
			
			conn = db.connect();
			stmt = conn.createStatement();
			String query = "SELECT * FROM drinks WHERE id = " + id;
			// return an object of type ResultSet - A set of data from the database
			ResultSet results = stmt.executeQuery(query); 
			results.next(); // moves the selection cursor down to the next row
//			System.out.println(results); // We need to convert to a useful object
			Drink drinkResult = modelDrink(results);
			return drinkResult;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Drink> getAllDrinks() {
		ArrayList<Drink> resultList = new ArrayList<>();
		try {
			conn = db.connect();
			stmt = conn.createStatement();
			String query = "SELECT * FROM drinks";
			ResultSet results = stmt.executeQuery(query);
			
			// While there is another row below this one, keep going
			while(results.next()) {
				// Return the current row as a Drink object, add it to this arraylist
				resultList.add(modelDrink(results));
			}
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Will return a Drink from a drink resultSet
	public Drink modelDrink(ResultSet result) {
		try {
			int id = result.getInt(1); // pass in the column number (1 - 5)
			String type = result.getString("type"); // pass in the column name (type, size)
			String size = result.getString("size");
			boolean bool = result.getBoolean("dairyFree");
			float cost = result.getFloat("cost");
			
			// Make a new Drink object 
			Drink drink = new Drink(id, type, size, bool, cost);
			return drink;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	
	
	
	

}
