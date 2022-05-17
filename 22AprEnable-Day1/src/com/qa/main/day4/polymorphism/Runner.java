package com.qa.main.day4.polymorphism;

public class Runner {
	
	/* Polymorphism
	 poly  - many / multiple
	 morph - changing
	 Polymorphism - Can the object take on multiple forms 
	 
	 Salmon object is an object of type Salmon
	 Salmon object is an object of type Fish
	 Salmon object is an object of type Object (Fish extends Object)  
	 
	 Salmon is 'polymorphic' because it can be atleast 2 forms (Salmon, Fish, Object) 
	 
	 */
	
	public static void main(String[] args) {
		
		Salmon salmonObj = new Salmon("pink");
		Fish fishObj = new Salmon("dull pink");
		Object objectObj = new Salmon("Gray");
		
		Fish codObj = new Cod("White");
		// Both Salmon and Cod have access to swim and inherited methods 
		// Because both Salmon and Cod are of type Fish, they can be put into ArrayList<Fish> 
		
		System.out.println(salmonObj.swim());
		System.out.println(fishObj.swim());
		// Casting our object as an object of type Fish
		System.out.println(((Fish) objectObj).swim());
		
		System.out.println(salmonObj.upriver());
		System.out.println(((Salmon) fishObj).upriver());
		System.out.println(((Salmon) objectObj).upriver());
		
	}

}
