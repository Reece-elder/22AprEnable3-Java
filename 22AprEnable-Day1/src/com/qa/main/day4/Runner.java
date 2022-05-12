package com.qa.main.day4;

import com.qa.main.day4.oopRecap.Drink;

public class Runner {

	public static void main(String[] args) {
		// We need to create Drink objects 
		Drink latte = new Drink("Latte", 3.19f, true, 321);
		Drink tea  = new Drink("English Tea", 2.35f, true, 103);
		
		System.out.println(latte); 
		System.out.println(latte.calories);
		
		

	}

}
