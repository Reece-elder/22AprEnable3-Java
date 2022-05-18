package com.qa.jdbcDemo;

public class JDBCRunner {
	
	public static void main(String[] args) {
		
		// Create my JDBC Demo Object
		JDBCDemo jdbc = new JDBCDemo();
		
		// Create our Cafe object
		Cafe newCafe = new Cafe();
		
		Drink latte = new Drink("latte", "grande", true, 1.50f);
		Drink drink2 = new Drink("caramel frappe", "venti", false, 4.15f);
		
		newCafe.addDrink(latte);
		newCafe.addDrink(drink2);
	}

}
