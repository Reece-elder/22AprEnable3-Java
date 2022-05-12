package com.qa.main.day3;

import com.qa.main.day3.array.ArrayDemo;
import com.qa.main.day3.array.ArrayListDemo;
import com.qa.main.day3.objectsDemo.Cake;

public class Runner {
	
	public static void main(String[] args) {
//		ArrayDemo.arrayExample();
//		ArrayDemo.colourExercise();
//		ArrayListDemo.arrayListDemo();
		
		// Make a cake object and print it out
		// Cake - Data type (String, int, ArrayList)
		// newCake - name of the variable
		// When making a scanner/arrayList we are making a new object
		// new Cake(pass, in, values)
		Cake newCake = new Cake(true, 4, 19.99f, "lilac");
		System.out.println(newCake); // horrible id reference..
		System.out.println(newCake.colour);
		System.out.println(newCake.vegan);
		
		Cake newerCake = new Cake(false, 2, 450.21f, "24 karat gold");
		System.out.println(newerCake.colour);
	}

}
