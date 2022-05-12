package com.qa.main.day3.array;

import java.util.ArrayList;

public class ArrayListDemo {
	
	
	// ArrayLists are a type of collection (java data organiser class?)
	// ArrayLists are mutable, they are resizable (we can add and remove data) 
	// Has a bunch of simple inbuilt methods for changing and updating the data
	
	public static void arrayListDemo() {
		
		// Datatype - ArrayList<type of data> 
		// Name of your arraylist
		// = new ArrayList<>();
		ArrayList<String> pizzaList = new ArrayList<>();
		
		System.out.println(pizzaList);
		
		// .add()
		// If I want to add data to my list i use .add()
		pizzaList.add("Pepperoni");
		pizzaList.add("Four Cheese");
		pizzaList.add("Hawiaain");
		pizzaList.add("BBQ Chicken");
		
		// .get()
		System.out.println(pizzaList.get(0));
		
		// .set() - used to update values 
		pizzaList.set(2, "hawaiian");
		
		// .remove() - remove an element from the list
		pizzaList.remove(3);
		
		// .size() - length of the arraylist
		System.out.println(pizzaList.size());
		
		System.out.println(pizzaList);
		
		// Standard for loop 
		for(int i = 0; i < pizzaList.size(); i++) {
			System.out.println(pizzaList.get(i));
		}
		
		// Enhanced For Loop - Assumes you are making a variable starting at 0, 
		// increasing by 1, and running until you finish the loop
		// for (DataType stored in the array - name of your temp variable : name of your array)
		for(String pizza : pizzaList) {
			System.out.println(pizza); // <-- Print out the value of each variable assuming its a string
		}
		
		
		// .clear() - clears the arraylist, removing everything
		pizzaList.clear();
		
		System.out.println(pizzaList);
		
		
	}

}
