package com.qa.main.day4.oopRecap;

import java.util.ArrayList;

public class Cafe {
	
	public String address;
	
	// Our cafe methods and variables are static
	
	// We should be making an object of our type Cafe, and running the methods of the object
	// static - make something static 
	// '' 	  - makes the class instanced 
	
	// ArrayList takes in objects of type Drink
	public ArrayList<Drink> orderList = new ArrayList<>();
	
	// Method takes in objects of type Drink
	public boolean addOrder(Drink order) {
		return orderList.add(order);
	}
	
	// Method to return my array list
	public ArrayList<Drink> getAllOrders() {
		return orderList;
	}
	
	

}
