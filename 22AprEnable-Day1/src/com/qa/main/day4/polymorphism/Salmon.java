package com.qa.main.day4.polymorphism;

public class Salmon extends Fish {

	public Salmon(String colour) {
		super(colour);
	}
	
	public String upriver() {
		return "swims up river!";
	}
	
}
