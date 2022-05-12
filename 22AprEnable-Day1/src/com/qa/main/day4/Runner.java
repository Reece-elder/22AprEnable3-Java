package com.qa.main.day4;

import com.qa.main.day4.oopRecap.Cafe;
import com.qa.main.day4.oopRecap.Drink;

public class Runner {

	// We are not making an object of our runner, so main is static
	public static void main(String[] args) {
		// We need to create Drink objects 
		Drink latte = new Drink("Latte", 3.19f, true, 321);
		Drink tea  = new Drink("English Tea", 2.35f, true, 103);
		
		System.out.println(latte); 
		System.out.println(latte.calories);
		
		// Our Class is trying to run an instanced method (Can't do)
		// Create an object of our cafe, to run our methods
		// Drink Objects - datatype of Drink
		// Cafe Objects  - datatype of Cafe
		Cafe qaoffee = new Cafe(); // Making a new cafe called qaoffeeCardiff 
		Cafe qaoffeeLeeds = new Cafe();
		Cafe qaoffeeNewport = new Cafe();
		
		// Replace Cafe -> qaoffee
		qaoffee.addOrder(latte);
		qaoffee.addOrder(tea);
		qaoffee.addOrder(new Drink("Mocha", 3.51f, false, 480)); 
		// We can't reuse this Object, there is no variable to access
		
		System.out.println(qaoffee.getAllOrders());
		
		
		// Static and Instanced
		// Within Java all methods and variables are either: static or instanced
		// If something is not static, it is instanced (default)
		// instanced - Each 'instance' (unique object) uses the same methods 
		// attributes but they are not connected
		
		// Do both of our drink calories have the same value? - No
		System.out.println(latte.calories);
		System.out.println(tea.calories);
		
		latte.calories = 500; // This won't change the calories of our tea!
		System.out.println(tea.calories);
		
		System.out.println("*********************");
		// Accessing a static variable from an object is bad practice
		System.out.println(latte.cupColour); 
		System.out.println(tea.cupColour);
		latte.cupColour = "red"; // Changing the cupcolour value from the latte object
		System.out.println(latte.cupColour); 
		System.out.println(tea.cupColour);
		
		// Changing the static variable via a class is good practice 
		Drink.cupColour = "Orange"; // Drink - Class
		System.out.println(latte.cupColour);
		System.out.println(tea.cupColour);
		
		// Access an instanced variable from a class
		// Drink.calories = 100; // A class cannot access instanced methods / variables 
		
		
		

	}

}
